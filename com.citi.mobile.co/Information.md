Application Vulnerable:

android:versionCode="24"
android:versionName="14.3"
package="com.citi.mobile.co"
platformBuildVersionCode="7"
platformBuildVersionName="2.1-update1"

Analysis:

1 - "libkonyjsvm.so" 4MB of ELF ? estrange, it sounds familiar.
Deconstructing Kony Android Applications: https://www.blackhat.com/docs/ldn-15/materials/london-15-Weedon-Deconstructing-Kony-Android-Apps-wp.pdf
That is epic fail.


2 - Class: com.rsa.mobilesdk.sdk.RootedDeviceChecker "Root Protection"

This class have a black list apps ("Superuser.apk", "myhappy.apk"), searching "su" on paths (/system/bin/", "/system/xbin/", "/sbin/",
"/system/", "/system/bin/.ext/", "/system/usr/we-need-root/") and searching packages ("com.noshufou.android.su", "eu.chainfire.supersu",
"eu.chainfire.supersu.pro", "com.koushikdutta.superuser", "com.noshufou.android.su.elite",  "david.lahuta.superuser.free.pro",
"com.bitcubate.android.su.installer", "com.bitcubate.superuser.pro", "david.lahuta.superuser") on the path "/system/app/" for suspicious APKs, lol.

Can be attacked by: Kernel Rootkits or Userland Rootkits.


3 - Class: com.rsa.mobilesdk.sdk.ApplicationKey "Crypto Store"

This class contains an method more advanced "getStoredApplicationKey" that contains the "Super Crypto Key";

SharedPreferences prefs = context.getSharedPreferences(APP_KEY_SHARED_PREFS, Context.MODE_PRIVATE);
if (prefs != null) {
    return prefs.getString(APP_KEY_PREF, null);
}

Can be attacked by: Kernel Rootkits or Userland Rootkits, is really simple read an file with root privileges, that is epic again.

You can read more about that, Insecure Local Storage: Shared Preferences: http://resources.infosecinstitute.com/android-hacking-security-part-9-insecure-local-storage-shared-preferences/


4 - Protections against MiTM(Man In The Middle)

Zero protections against MiTM, you can see username, password and values of the account, that is epic again.

![MiTM](MITM.png)
![MiTM](MITM.png)
![MiTM](MITM.png)
![MiTM](MITM.png)

This is the first update, Thanks City Bank for hire the "Best Developers & Security Guys", without that i can't write that, continue hiring this type of idiots lol.


