package com.osesame.android.scanner;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.List;

class CameraPreview extends ViewGroup implements Callback {
    private final String TAG;
    String customFocusMode;
    AutoFocusCallback mAutoFocusCallback;
    Camera mCamera;
    SurfaceHolder mHolder;
    PreviewCallback mPreviewCallback;
    Size mPreviewSize;
    List<Size> mSupportedPreviewSizes;
    SurfaceView mSurfaceView;
    int preferedPreviewSizeIndex;

    CameraPreview(Context context, PreviewCallback previewCallback, AutoFocusCallback autoFocusCb) {
        super(context);
        this.TAG = "CameraPreview";
        this.preferedPreviewSizeIndex = -1;
        this.mPreviewCallback = previewCallback;
        this.mAutoFocusCallback = autoFocusCb;
        this.mSurfaceView = new SurfaceView(context);
        addView(this.mSurfaceView);
        this.mHolder = this.mSurfaceView.getHolder();
        this.mHolder.addCallback(this);
        this.mHolder.setType(3);
    }

    CameraPreview(Context context, PreviewCallback previewCallback, AutoFocusCallback autoFocusCb, int preferedPreviewSizeIdx) {
        super(context);
        this.TAG = "CameraPreview";
        this.preferedPreviewSizeIndex = -1;
        Log.d("CameraPreview", "preferedPreviewSizeIndex : " + preferedPreviewSizeIdx);
        this.preferedPreviewSizeIndex = preferedPreviewSizeIdx;
        this.customFocusMode = null;
        this.mPreviewCallback = previewCallback;
        this.mAutoFocusCallback = autoFocusCb;
        this.mSurfaceView = new SurfaceView(context);
        addView(this.mSurfaceView);
        this.mHolder = this.mSurfaceView.getHolder();
        this.mHolder.addCallback(this);
        this.mHolder.setType(3);
    }

    CameraPreview(Context context, PreviewCallback previewCallback, AutoFocusCallback autoFocusCb, int preferedPreviewSizeIdx, String forceFocusMode) {
        super(context);
        this.TAG = "CameraPreview";
        this.preferedPreviewSizeIndex = -1;
        Log.d("CameraPreview", "preferedPreviewSizeIndex : " + preferedPreviewSizeIdx);
        Log.d("CameraPreview", "forceFocusMode Manual : " + forceFocusMode);
        this.preferedPreviewSizeIndex = preferedPreviewSizeIdx;
        this.customFocusMode = forceFocusMode;
        this.mPreviewCallback = previewCallback;
        this.mAutoFocusCallback = autoFocusCb;
        this.mSurfaceView = new SurfaceView(context);
        addView(this.mSurfaceView);
        this.mHolder = this.mSurfaceView.getHolder();
        this.mHolder.addCallback(this);
        this.mHolder.setType(3);
    }

    public void setCamera(Camera camera) {
        this.mCamera = camera;
        if (this.mCamera != null) {
            this.mSupportedPreviewSizes = this.mCamera.getParameters().getSupportedPreviewSizes();
            this.mPreviewSize = getOptimalPreviewSize(this.mSupportedPreviewSizes, OsesameConstants.TARGET_WIDTH, OsesameConstants.TARGET_HEIGHT);
            requestLayout();
        }
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(resolveSize(getSuggestedMinimumWidth(), widthMeasureSpec), resolveSize(getSuggestedMinimumHeight(), heightMeasureSpec));
    }

    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        if (changed && getChildCount() > 0) {
            View child = getChildAt(0);
            int width = r - l;
            int height = b - t;
            int previewWidth = width;
            int previewHeight = height;
            if (this.mPreviewSize != null) {
                previewWidth = this.mPreviewSize.width;
                previewHeight = this.mPreviewSize.height;
            }
            if (width * previewHeight > height * previewWidth) {
                int scaledChildWidth = (previewWidth * height) / previewHeight;
                child.layout((width - scaledChildWidth) / 2, 0, (width + scaledChildWidth) / 2, height);
                return;
            }
            int scaledChildHeight = (previewHeight * width) / previewWidth;
            child.layout(0, (height - scaledChildHeight) / 2, width, (height + scaledChildHeight) / 2);
        }
    }

    public void hideSurfaceView() {
        this.mSurfaceView.setVisibility(4);
    }

    public void showSurfaceView() {
        this.mSurfaceView.setVisibility(0);
    }

    public void surfaceCreated(SurfaceHolder holder) {
        try {
            if (this.mCamera != null) {
                this.mCamera.setPreviewDisplay(holder);
            }
        } catch (IOException exception) {
            Log.e("CameraPreview", "IOException caused by setPreviewDisplay()", exception);
        }
    }

    public void surfaceDestroyed(SurfaceHolder holder) {
        if (this.mCamera != null) {
            this.mCamera.cancelAutoFocus();
            this.mCamera.stopPreview();
        }
    }

    private Size getOptimalPreviewSize(List<Size> sizes, int targetWidth, int targetHeight) {
        if (sizes == null) {
            return null;
        }
        long targetPixels = (long) (targetWidth * targetHeight);
        Size optimalSize = null;
        long minDiff = Long.MAX_VALUE;
        if (this.preferedPreviewSizeIndex > -1) {
            Log.d("CameraPreview", "preferedPreviewSize : Manual");
            optimalSize = (Size) sizes.get(this.preferedPreviewSizeIndex);
        } else if (null == null) {
            Log.d("CameraPreview", "preferedPreviewSize : Auto");
            for (Size size : sizes) {
                long currentPixels = (long) (size.width * size.height);
                if (minDiff > Math.abs(currentPixels - targetPixels)) {
                    optimalSize = size;
                    minDiff = Math.abs(currentPixels - targetPixels);
                }
            }
        }
        Log.d("CameraPreview", "optimalSize : " + optimalSize.width + " x " + optimalSize.height);
        return optimalSize;
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
        if (holder.getSurface() != null && this.mCamera != null) {
            Parameters parameters = this.mCamera.getParameters();
            parameters.setPreviewSize(this.mPreviewSize.width, this.mPreviewSize.height);
            for (String focusMode : parameters.getSupportedFocusModes()) {
                Log.d("CameraPreview", "Supported focusMode : " + focusMode);
                if (this.customFocusMode != null) {
                    if (this.customFocusMode == focusMode) {
                        parameters.setFocusMode(focusMode);
                    }
                } else if (focusMode == "infinity") {
                    parameters.setFocusMode(focusMode);
                }
            }
            requestLayout();
            this.mCamera.setParameters(parameters);
            this.mCamera.setPreviewCallback(this.mPreviewCallback);
            this.mCamera.startPreview();
            this.mCamera.autoFocus(this.mAutoFocusCallback);
        }
    }
}
