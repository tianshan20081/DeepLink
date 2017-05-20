# DeepLink
---
### Open Android App from Browser 

```
<activity android:name=".ui.MainActivity">
    <intent-filter>
        <action android:name="android.intent.action.VIEW"/>

        <category android:name="android.intent.category.BROWSABLE"/>
        <category android:name="android.intent.category.DEFAULT"/>

        <!--<a href="deeplink://deeplink.com/main?data={'name':'zhangsan','age':10}">deeplink://deeplink.com/main?</a>-->
        <data
            android:host="deeplink.com"
            android:path="/main"
            android:scheme="deeplink"/>

    </intent-filter>
    <intent-filter>
        <action android:name="android.intent.action.VIEW"/>

        <category android:name="android.intent.category.BROWSABLE"/>
        <category android:name="android.intent.category.DEFAULT"/>

        <!--<a href="deeplink://?data={'name':'zhangsan','age':10}">deeplink://?</a>-->
        <data
            android:scheme="deeplink"/>
    </intent-filter>
</activity>
```

#### openApp.html
```
<!DOCTYPE html>
<html>
<head>
    <title>打开客户端</title>
</head>
<body>

<br/>

<a href="deeplink://?data={'name':'zhangsan','age':10}">deeplink://?</a>

<br/>

<a href="deeplink://deeplink.com/main?data={'name':'zhangsan','age':10}">deeplink://deeplink.com/main?</a>
</body>
</html>

```
