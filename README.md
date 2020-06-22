---
title: android-demo
tags: 新建,模板,小书匠
grammar_cjkRuby: true
---
### 2017
|  模块   |  时间   |  简书   |  说明   |
| --- | --- | --- | --- |
|  android_webview   |  04.14   |  http://www.jianshu.com/p/1071b1cdbbf5   |   WebView的使用  |
|  android_preference_activity   |   04.27  |   http://www.jianshu.com/p/4a65f4a912c6  |   PreferenceActivity的使用  |
|  android_connectivity_manager   |  04.29   |   http://www.jianshu.com/p/c415691b282c  |  网络连接管理   |
|  android_wifi  |  04.29    |  http://www.jianshu.com/p/c415691b282c |  Wifi的使用   |
|  android_bluetooth   |  05.03   |  http://www.jianshu.com/p/448f9292aad2  |  蓝牙的使用   |
| android_customize_vew |  06.04    |  http://www.jianshu.com/p/6326420d55fb     |  自定义View     |
| android_encrypt |  10.19  |     |  加密解密算法   |


### 2018
|  模块   |  时间   |  简书   |  说明   |
| --- | --- | --- | --- |
| android_face_detect  |  01.17  |  | 自动对焦检测人脸 Face++ 虹软  |

### 2019
|  模块   |  时间   |  简书   |  说明   |
| --- | --- | --- | --- |
|  |  |  |  |

### 2019
#### 04.09:lib_promise 
```java
Promise<String> promise = Function.execute(new Callable<String>() {
    @Override
    public String call() throws Exception {
        // This method will run on a background thread
        return "Hello world!";
    }
});
```
```java
promise.thenOnMainThread(new Task<String>() {
    @Override
    public void run(String message) {
        Toast.makeText(getContext(), message, LENGTH_LONG);
    }
}).onErrorOnMainThread(new Task<Throwable>() {
    @Override
    public void run(Throwable data) {
        Toast.makeText(getContext(), "Oops!", LENGTH_LONG);
    }
});
```