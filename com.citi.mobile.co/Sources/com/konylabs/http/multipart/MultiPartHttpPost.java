package com.konylabs.http.multipart;

import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.message.BasicNameValuePair;

public class MultiPartHttpPost {
    private HttpPost httppost;
    List<NameValuePair> namevaluePairs;

    public MultiPartHttpPost(HttpPost httpPost) {
        this.namevaluePairs = new ArrayList();
        this.httppost = httpPost;
    }

    public HttpPost getMultiPartHttpPost() {
        if (this.httppost == null) {
            return null;
        }
        try {
            MultipartEntity multipartEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
            for (int i = 0; i < this.namevaluePairs.size(); i++) {
                BasicNameValuePair basicNameValuePair = (BasicNameValuePair) this.namevaluePairs.get(i);
                String name = basicNameValuePair.getName();
                if (name.startsWith("filename=")) {
                    File file = new File(Uri.parse(basicNameValuePair.getValue()).getPath());
                    if (file.exists()) {
                        multipartEntity.addPart(name.substring(name.indexOf("=") + 1), new FileBody(file, "image/jpg"));
                    }
                } else {
                    multipartEntity.addPart(name, new StringBody(basicNameValuePair.getValue()));
                }
            }
            this.httppost.setEntity(multipartEntity);
            return this.httppost;
        } catch (Throwable e) {
            Log.e(e.getClass().getName(), e.getMessage(), e);
            return null;
        }
    }

    public void setNameValuePairs(List<NameValuePair> list) {
        this.namevaluePairs = list;
    }
}
