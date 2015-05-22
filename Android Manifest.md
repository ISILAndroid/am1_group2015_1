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

## Etiquetas
 ```
	<action> 
	<activity> 
	<activity-alias> 
	<application> 
	<category> 
	<data> 
	<grant-uri-permission> 
	<instrumentation> 
	<intent-filter> 
	<manifest> 
	<meta-data> 
	<permission> 
	<permission-group> 
	<permission-tree> 
	<provider> 
	<receiver> 
	<service> 
	<supports-screens> 
	<uses-configuration> 
	<uses-feature> 
	<uses-library> 
	<uses-permission> 
	<uses-sdk>
 ```
## Permisos
 ```
android.permission.CALL_EMERGENCY_NUMBERS 
android.permission.READ_OWNER_DATA 
android.permission.SET_WALLPAPER 
android.permission.DEVICE_POWER
 ```

 ## Ejemplos

  ```
 <?xml version="1.0" encoding="utf-8"?>
	<manifest xmlns:android="http://schemas.android.com/apk/res/android"
	    package="com.emedinaa.projects.notification" >

	    <uses-permission android:name="android.permission.INTERNET" />

	    <permission
	        android:name="com.emedinaa.projects.notification.permission.C2D_MESSAGE"
	        android:protectionLevel="signature" />

	    <uses-permission android:name="com.emedinaa.projects.notification.permission.C2D_MESSAGE" />
	    <uses-permission android:name="android.permission.VIBRATE" />

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



	        <activity
	            android:name=".NotificationActivity"
	            android:label="@string/title_activity_notification"
	            android:screenOrientation="portrait">
	        </activity>

	        <receiver
	            android:name=".service.GCMBroadcastReceiver"
	            android:permission="com.google.android.c2dm.permission.SEND" >
	            <intent-filter>
	                <action android:name="com.google.android.c2dm.intent.RECEIVE" />
	                <action android:name="com.google.android.c2dm.intent.REGISTRATION" />

	                <category android:name="com.osp.projects.appprestadito" />
	            </intent-filter>
	        </receiver>
	        
	    </application>

	</manifest>
 ```

## Definir que actividad se muestra primero en pantalla

```
	<?xml version="1.0" encoding="utf-8"?>
	<manifest xmlns:android="http://schemas.android.com/apk/res/android"
	    package="com.example.applistsimple" >

	    <application
	        android:allowBackup="true"
	        android:icon="@drawable/ic_launcher"
	        android:label="@string/app_name"
	        android:theme="@style/AppTheme" >
	        <activity
	            android:name=".HomeActivity"
	            android:label="@string/app_name"
	            android:screenOrientation="portrait" >
	            <!-- Esta actividad va primero -->
	            <intent-filter>
	                <action android:name="android.intent.action.MAIN" />

	                <category android:name="android.intent.category.LAUNCHER" />
	            </intent-filter>
	        </activity>
	        <activity
	            android:name=".SimpleActivity"
	            android:label="@string/title_activity_simple"
	            android:screenOrientation="portrait" >
	        </activity>
	        <activity
	            android:name=".LCompuestaActivity"
	            android:label="@string/title_activity_lcompuesta"
	            android:screenOrientation="portrait">
	        </activity>
	        <activity
	            android:name=".LSimpleActivity"
	            android:label="@string/title_activity_lsimple"
	            android:screenOrientation="portrait">

	            <!--
		            <intent-filter>
		                <action android:name="android.intent.action.MAIN" />

		                <category android:name="android.intent.category.LAUNCHER" />
		            </intent-filter> 
	            -->
	        </activity>
	    </application>

	</manifest>

```
Referencia
[Android Manifest](http://developer.android.com/guide/topics/manifest/manifest-intro.html)


* [Github AM1](https://github.com/ISILAndroid/am1_group2015_1)

