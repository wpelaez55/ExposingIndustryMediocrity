Application Vulnerable:

CitiMobile CO, Citibank Colombia S.A.<br>
Google Play: https://play.google.com/store/apps/details?id=com.citi.mobile.co<br>

VersionCode="24"<br>
VersionName="14.3"<br>
Package="com.citi.mobile.co"<br>
PlatformBuildVersionCode="7"<br>
PlatformBuildVersionName="2.1-update1"<br>

Analysis:

We started with a typical reversing of an Android application downloaded from Google Play<br>

After analysis we found the following problems:<br>

1 - We found a bit strange native library "libkonyjsvm.so" 4MB of ELF ?<br> 

Virus Total Report: https://www.virustotal.com/es/file/8c5a06348080237894a49324eda0d4229ab14eb382d3698bf63a528fa17db6b9/analysis/1475126425/<br>

It sounds familiar, Chris Weedon, on June 1, 2015 published an paper; Deconstructing Kony Android Applications: https://www.blackhat.com/docs/ldn-15/materials/london-15-Weedon-Deconstructing-Kony-Android-Apps-wp.pdf<br>

2 - Class: com.rsa.mobilesdk.sdk.RootedDeviceChecker "Root Protection"<br>

This class have a black list apps ("Superuser.apk", "myhappy.apk"), searching "su" on paths (/system/bin/", "/system/xbin/", "/sbin/", "/system/", "/system/bin/.ext/", "/system/usr/we-need-root/") and searching packages ("com.noshufou.android.su", "eu.chainfire.supersu", "eu.chainfire.supersu.pro", "com.koushikdutta.superuser", "com.noshufou.android.su.elite",  "david.lahuta.superuser.free.pro", "com.bitcubate.android.su.installer", "com.bitcubate.superuser.pro", "david.lahuta.superuser") on the path "/system/app/" for suspicious APKs, really is not a better way to detect "Root", remeber Android is an linux.<br>

This class can be attacked by: Rootkits, easily an attacker can inject code, and modify this programatically hiding the "su" and the black list apps & packages.<br>

3 - Class: com.rsa.mobilesdk.sdk.ApplicationKey "Crypto Store"<br>

This class contains an method more advanced "getStoredApplicationKey" that contains the "Crypto Key";<br>

>SharedPreferences prefs = context.getSharedPreferences(APP_KEY_SHARED_PREFS, Context.MODE_PRIVATE);<br>
>if (prefs != null) {<br>
>    return prefs.getString(APP_KEY_PREF, null);<br>
>}<br>

That can be attacked by: inject code inside the VM or access with root privileges, is really simple read an file.<br>

You can read more about that, Insecure Local Storage: Shared Preferences: http://resources.infosecinstitute.com/android-hacking-security-part-9-insecure-local-storage-shared-preferences/<br>

4 - Protections against MiTM(Man In The Middle)<br>

Zero protections against MiTM, Certificate validation or domain validation, you can see username, password and values of the account.<br>

![MiTM](https://github.com/JhetoX/ExposingIndustryMediocrity/blob/master/com.citi.mobile.co/MiTM/MITM01.png)<br>
![MiTM](https://github.com/JhetoX/ExposingIndustryMediocrity/blob/master/com.citi.mobile.co/MiTM/MITM02.png)<br>
![MiTM](https://github.com/JhetoX/ExposingIndustryMediocrity/blob/master/com.citi.mobile.co/MiTM/MITM03.png)<br>
![MiTM](https://github.com/JhetoX/ExposingIndustryMediocrity/blob/master/com.citi.mobile.co/MiTM/MITM04.png)<br>

Is really sick see this type of apps on the market, thinking that is an Colombian Bank App.<br>

This is the first update, Thanks City Bank for hire the "Best Developers & Security Guys", without that i can't write that, continue hiring this type of idiots lol.<br>


