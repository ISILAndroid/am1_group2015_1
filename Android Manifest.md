# Android Manifest - Aplicaciones móviles 1

### Instructor : Eduardo José Medina Alfaro isil@qd.pe

## Ubicación

app/src/main/AndroidManifest.xml

## Estructura

 ```
	<?xml version="1.0" encoding="utf-8"?>
	<manifest xmlns:android="http://schemas.android.com/apk/res/android"
	    package="com.emedinaa.androidvolleyphp" >

	    <uses-permission android:name="android.permission.INTERNET" />

	    <application
	        android:allowBackup="true"
	        android:icon="@drawable/ic_launcher"

	        android:label="@string/app_name"
	        android:theme="@style/AppTheme" >
	        <activity
	            android:name=".HomeActivity"
	            android:label="@string/app_name"
	            android:screenOrientation="portrait">
	            <intent-filter>
	                <action android:name="android.intent.action.MAIN" />

	                <category android:name="android.intent.category.LAUNCHER" />
	            </intent-filter>
	        </activity>
	    </application>

	</manifest>
 ```

## Permisos


Referencia

[Android Manifest](http://developer.android.com/guide/topics/manifest/manifest-intro.html)

 * [Github AM1](https://github.com/ISILAndroid/am1_group2015_1)
