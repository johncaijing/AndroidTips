# AndroidTips
A collections of tips in Android developing.

##前言
我们在日常开发中，会遇到各种各样的问题，或大或小。正是通过解决这些问题，使得我们的开发技能得到进步。养成记录的好习惯，方便自己日后查看，也方便广大开发者能找到自己遇到的问题的解决方案。

PS：持续更新中(last update date:2016-01-18 14:34)

##目录
>[一.模拟器](#genymotion)

>[二.Android Studio](#AndroidStudio)

>[三.Gradle](#Gradle)

>[四.资源混淆](#resourceMix)

>[五.动画](#animation)

>[六.View](#View)

>[七.XML](#XML)

>[八.Java](#Java)

>[九.混淆](#obfuscate)

>[十.优化](#optimize)

>[十一.优秀开发资料](#devTools)

> [十二.值得关注的Android大牛](#greatDeveloper)

> [十三.Canvas](#Canvas) 

> [十四.学习方法总结](#howToLearn)

> [十五.Kotlin](#kotlin) 

##正文
<h6 id="genymotion">一.模拟器</h6>

1.genymotion模拟器如何锁屏？
>答：在模拟器的设置-->安全-->屏幕锁定-->选择除<**无**>以外的其他选项。
       然后点击模拟器的电源按钮即可锁屏（或在命令行中输入```adb shell keyevent 26```原理和按电源键一样，模拟电源键点击事件）
       
 参考链接：[http://stackoverflow.com/questions/29292060/how-to-lock-genymotion](http://stackoverflow.com/questions/29292060/how-to-lock-genymotion)
 
 2.genymotion模拟器如何打开输入法软键盘？
 >答：在设置输入法选项中，关闭物理键盘即可。
 
 3.genymotion如何安装谷歌服务？
 >答:   [http://stackoverflow.com/questions/17831990/how-do-you-install-google-frameworks-play-accounts-etc-on-a-genymotion-virt](http://stackoverflow.com/questions/17831990/how-do-you-install-google-frameworks-play-accounts-etc-on-a-genymotion-virt)
 
 
<h6 id="AndroidStudio">二.Android Studio</h6>
1.Andorid Studio中有哪些好用的插件？
>答: 

>1>.[GsonFormat](https://github.com/zzz40500/GsonFormat):用json数据一键生成JavaBeans

>2>. [ADB Idea](https://github.com/pbreault/adb-idea)：ctrl + Shift + A 查找中添加常用卸载安装app的一些操作，无需命令行

> 3>.[android-parcelable-intellij-plugin](https://github.com/mcharmas/android-parcelable-intellij-plugin) 快速实现parcelable序列化

> 4>.[android-butterknife-zelezny](https://github.com/avast/android-butterknife-zelezny) ButterKnife生成器，快速生成View声明代码

> 5>.[Android WiFi ADB](https://github.com/pedrovgs/AndroidWiFiADB) 使用WiFi连接而不需要USB连接Android设备达到安装、运行、调试应用的目的。

2.Android Studio提升效率的技巧文章
>答:

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-1/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-1/)

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-2/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-2/)

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-3/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-3/)

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-4/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-4/)

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-5/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-5/)

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-6/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-6/)

3.更新Android Studio报如下错误如何解决？
>Android Studio: Error:/android-studio/gradle/gradle-2.4/lib/plugins/gradle-diagnostics-2.4.jar (No such file or directory)

更新Android Studio后，Gradle的也得到了更新。cd到gradle文件夹下查看里面gradle文件夹的名字。例如gradle-2.8。然后在Android Studio中依次打开Module Settings->Project，将Gradle version改成和之前文件夹对应的版本。Rebuild项目就好了。

4.Android Studio的常用快捷键？
>答:

>1.快速生成get,set代码（Command+N）

5.Android Studio中开启DDMS？

>答:在Android中，依次点击Tools->Android->Android Device Monitor

6.Android Studio与Gradle教程
>答：

>1.[拥抱 Android Studio 之一：从 ADT 到 Android Studio](http://kvh.io/2015/12/01/embrace-android-studio-migration/)

>2.[拥抱 Android Studio 之二：Android Studio 与 Gradle 深入](http://kvh.io/2015/12/17/embrace-android-studio-indepth/)

>3.[拥抱 Android Studio 之三：溯源，Groovy 与 Gradle 基础](http://kvh.io/2016/01/04/embrace-android-studio-groovy-gradle/)

<h6 id="Gradle">三.Gradle</h6>
1.Gradle有什么教程?


>1.[Gradle User Guide 中文版](https://dongchuan.gitbooks.io/gradle-user-guide-/content/)

>2.[Gradle官方教程](https://docs.gradle.org/current/userguide/userguide.html)

>3.[灵活强大的构建系统Gradle（美团技术团队）](http://tech.meituan.com/gradle-practice.html)

>4.[Android官方Gradle教程](https://developer.android.com/intl/zh-cn/tools/building/plugin-for-gradle.html)

>5.[Gradle官方Training](http://gradle.org/getting-started-android/)

>6.[android-studio.org的Gradle教程](http://ask.android-studio.org/?/explore/category-gradle)

>7.[Android Plugin DSL Reference](http://google.github.io/android-gradle-dsl/current/?url_type=39&object_type=webpage&pos=1)

>8.[Gradle脚本基础全攻略](http://blog.csdn.net/yanbober/article/details/49314255#0-tsina-1-52349-397232819ff9a47a7b7e80a40613cfe1)

>9.[深入理解Android之Gradle](http://blog.csdn.net/innost/article/details/48228651)

>10.[Android 开发必备知识：我和 Gradle 有个约会(腾讯bugly团队)](http://mp.weixin.qq.com/s?__biz=MzA3NTYzODYzMg==&mid=401572523&idx=1&sn=19504d41b81f82a5388ae4f95072aea5&scene=0#wechat_redirect)

2.Gradle在编译的时候报如下错误：Error:Timeout waiting to lock buildscript class cache for build file ，怎么解决？

>答:

>Windows:删除C:\Users\Administrator\.gradle\caches.这个文件夹

>OS X:删除~/.gradle/caches这个文件夹

参考：[http://stackoverflow.com/questions/31784132/errortimeout-waiting-to-lock-buildscript-class-cache-for-build-file-when-change](http://stackoverflow.com/questions/31784132/errortimeout-waiting-to-lock-buildscript-class-cache-for-build-file-when-change)

3.什么是Gradle，为什么在Android Studio中引进Gradle?
>答：

[http://stackoverflow.com/questions/16754643/what-is-gradle-in-android-studio](http://stackoverflow.com/questions/16754643/what-is-gradle-in-android-studio)

<h6 id="resourceMix">四.资源混淆</h6>
1.资源混淆有什么好的技术文章?

>答:

>1.[美团Android资源混淆保护实践](http://tech.meituan.com/mt-android-resource-obfuscation.html)

>2.[安装包立减1M--微信Android资源混淆打包工具](http://mp.weixin.qq.com/s?__biz=MzAwNDY1ODY2OQ==&mid=208135658&idx=1&sn=ac9bd6b4927e9e82f9fa14e396183a8f&scene=23&srcid=1012zDgw2RHFIoV0NLKVHhbT#rd)

<h6 id="animation">五.动画</h6>
1.关于动画有什么教程?
>1.[Android官方](http://developer.android.com/intl/zh-cn/guide/topics/graphics/index.html)

>2.[tutorialspoint动画教程](http://www.tutorialspoint.com/android/android_animations.htm)

>3.[Android属性动画完全解析(上)，初识属性动画的基本用法](http://blog.csdn.net/guolin_blog/article/details/43536355)

>4.[ Android属性动画完全解析(中)，ValueAnimator和ObjectAnimator的高级用法](http://blog.csdn.net/guolin_blog/article/details/43816093)

>5.[Android属性动画完全解析(下)，Interpolator和ViewPropertyAnimator的用法](http://blog.csdn.net/guolin_blog/article/details/44171115)

>6.[Using animations in Android application](http://www.vogella.com/tutorials/AndroidAnimation/article.html)

>7 .[动画系列 - 传统View动画与Property动画基础及比较](http://www.lightskystreet.com/2014/12/03/view-and-property-anim-knowldege-and-compare/)

>8 .[动画系列 - PropertyAnim 详解](http://www.lightskystreet.com/2014/12/04/propertyview-anim-analysis/)

>9 .[动画系列 - PropertyAnim 实际应用](http://www.lightskystreet.com/2014/12/10/propertyview-anim-practice/)

>10 .[动画系列 - ViewPager动画](http://www.lightskystreet.com/2014/12/15/viewpager-anim/)

>11 .[Android 动画基础](http://www.lightskystreet.com/2015/05/23/anim_basic_knowledge/)

>12 .[codepath_android_guides_animations](https://github.com/codepath/android_guides/wiki/Animations)

>12 .[bignerdranch_frame-animations-in-android](https://www.bignerdranch.com/blog/frame-animations-in-android/)

>13 .[Building Meaningful Motion(Plaid作者Android动画演讲分享)](https://photos.google.com/share/AF1QipMRnZL6gNbS06fnBNtKffRm9HBaxW8iP6w0L1T4nZYLI6s3wi_l8daT6mq4nwPf-w?key=LThZNmFXUUtmNi04bWlEYmVfcWdPenlvaDdCRU13)

<h6 id="View">六.View</h6>
1.View是如何绘制的？
>1.[How Android Draws Views](http://developer.android.com/intl/zh-cn/guide/topics/ui/how-android-draws.html)

>2.[Android视图状态及重绘流程分析，带你一步步深入了解View(一)](http://blog.csdn.net/guolin_blog/article/details/12921889)

>3.[Android视图状态及重绘流程分析，带你一步步深入了解View(二)](http://blog.csdn.net/guolin_blog/article/details/16330267)

>4.[Android视图状态及重绘流程分析，带你一步步深入了解View(三)](http://blog.csdn.net/guolin_blog/article/details/17045157)

>5.[Android视图状态及重绘流程分析，带你一步步深入了解View(四)](http://blog.csdn.net/guolin_blog/article/details/17357967)

2.如何实现自定义View？
>1.[Android官方教程](http://developer.android.com/intl/zh-cn/training/custom-views/index.html)

>2.[Android官方教程中文版](http://hukai.me/android-training-course-in-chinese/ui/custom-view/index.html)

>3.[Creating custom and compound Views in Android - Tutorial](http://www.vogella.com/tutorials/AndroidCustomViews/article.html)

>4.[Tutorialspoint教程](http://www.tutorialspoint.com/android/android_custom_components.htm)

>5.[ Android自定义View的实现方法，带你一步步深入了解View(四)](http://blog.csdn.net/guolin_blog/article/details/17357967)

>6.[Canvas and Drawables
](http://developer.android.com/intl/zh-cn/guide/topics/graphics/2d-graphics.html)

3.Android touch事件分发机制
>1.[Managing Touch Events in a ViewGroup](http://developer.android.com/intl/zh-cn/training/gestures/viewgroup.html)

>2.[Android事件分发机制完全解析，带你从源码的角度彻底理解(上)](http://blog.csdn.net/guolin_blog/article/details/9097463)

>3.[Android事件分发机制完全解析，带你从源码的角度彻底理解(下)](http://blog.csdn.net/guolin_blog/article/details/9153747)

>4.[Android事件传递机制](http://ryantang.me/blog/2014/01/02/android-event-dispatch/)

>5.[Handling single and multi touch on Android - Tutorial](http://www.vogella.com/tutorials/AndroidTouch/article.html)

4.ImageView使用src和background设置图片的区别？
>1.[http://stackoverflow.com/questions/5454491/what-is-the-difference-between-src-and-background-of-imageview](http://stackoverflow.com/questions/5454491/what-is-the-difference-between-src-and-background-of-imageview)

>2.[Android 中 imageView 的 Src 和 Background
](http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2015/0723/3217.html)



<h6 id="XML">七.XML</h6>

1.为什么在XML代码中有tools命名空间？
代码如下:

```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              xmlns:tools="http://schemas.android.com/tools"
              android:layout_width="match_parent"
              android:layout_height="wrap_content">     
       <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        tools:text="0"/>
</LinearLayout>
```

>tools:text，其实就是给ADT用的，用于在design页面能够预览到这个属性的值，但是当实际上运行的时候是看不到这个值的。具体可查看[Designtime Layout Attributes](http://tools.android.com/tips/layout-designtime-attributes) 


<h6 id="Java">八.Java</h6>

>1.[深入理解Java中的final关键字](http://www.importnew.com/7553.html)

>2.[Java中==和equals的区别](http://stackoverflow.com/questions/7520432/java-vs-equals-confusion)

>3.[Java中的hashCode()方法和equals()方法](http://www.ibm.com/developerworks/library/j-jtp05273/)

<h6 id="obfuscate">九.混淆</h6>
>1. Android混淆有什么资料教程?

>答:

>* 1.[Android官方混淆教程](http://developer.android.com/tools/help/proguard.html)

>* 2.[ProGuard官方教程](http://proguard.sourceforge.net/manual/examples.html)

<h6 id="optimize">十.优化</h6>

>1.[Android内存优化杂谈(微信移动客户端开发团队)](https://mp.weixin.qq.com/s?__biz=MzAwNDY1ODY2OQ==&mid=400656149&idx=1&sn=122b4f4965fafebf78ec0b4fce2ef62a&scene=0&key=ac89cba618d2d9769bc3006ae6f052433e9addebbf0099674296838d889f7d2c4098d859550e3bf2f6b53b3483336fec&ascene=7&uin=MTgxNDQ2NzkyMg%3D%3D&devicetype=android-19&version=26030832&nettype=ctlte&pass_ticket=LuET1X%2BVwvmFOKoypeaRevizrPu8nav3c69WqE2ynS2F%2BUBstsQr9bD%2FYhH3gEAj)

>2.[如何提高开发效率?(微信移动客户端开发团队)](https://mp.weixin.qq.com/s?__biz=MzAwNDY1ODY2OQ==&mid=400785752&idx=1&sn=e1c166e7fad0892811c9ca9bca6d1540&scene=0&key=41ecb04b051110033c2815a97388b84addcfa13da2d8c8fd754bdd21384a795226da667df6a4f1b591c452ccd48d29b8&ascene=0&uin=NTMyODkxMDE1&devicetype=iMac+MacBookPro12%2C1+OSX+OSX+10.11.2+build(15C50)&version=11020201&pass_ticket=ZXGITxr6bbn9Jmjzi5s4TzNgphY7BZ3j7xzQh%2BtYcqRDRivYxSjA1JbKPe1ME1q4)

>3.[Android 开发绕不过的坑：你的 Bitmap 究竟占多大内存？(腾讯Bugly团队)](https://mp.weixin.qq.com/s?__biz=MzA3NTYzODYzMg==&mid=403263974&idx=1&sn=b0315addbc47f3c38e65d9c633a12cd6&scene=0&key=41ecb04b05111003d79189315d2ebdda9a5dc312d579a616c9358c3994f94eaf700ba910fb56c37d348fbe317cbce872&ascene=0&uin=NTMyODkxMDE1&devicetype=iMac+MacBookPro12%2C1+OSX+OSX+10.11.2+build(15C50)&version=11020201&pass_ticket=uq%2BZUPewIgxSiSrWWGqLMnd8%2Fy8eclx6vr92bs5s8Q9YVusWCl2cgRirA7iVDRu%2B)

<h6 id="devTools">十一.优秀开发资料</h6>

>1.如何寻找优秀开源库？

>答：

>* 1.[codeKK开源库收集网站(由国内Android大牛Trinea)维护)](http://p.codekk.com/)
>* 2.[查看Github JAVA trending](https://github.com/trending?l=java)

>2.在线查看Android源码的网站:

>* 1.[http://grepcode.com/project/repository.grepcode.com/java/ext/com.google.android/android/](http://grepcode.com/project/repository.grepcode.com/java/ext/com.google.android/android/)
>* 2.[https://github.com/android](https://github.com/android)

>3.在线书籍:

>* 1.[Android 实战技巧](http://wiki.jikexueyuan.com/project/android-actual-combat-skills/)

>* 2.[《Kotlin for android developers》中文版](https://wangjiegulu.gitbooks.io/kotlin-for-android-developers-zh/content/index.html)

>* 3.[RxJava Essentials 中文翻译版](https://github.com/yuxingxin/RxJava-Essentials-CN)


>4.程序员的读书清单

>答:

>* 1.[程序员必读书单 1.0(作者:Lucida,Google大牛)](http://zh.lucida.me/blog/developer-reading-list/)

<h6 id="greatDeveloper">十二.值得关注的Android大牛</h6>
>[国外](https://github.com/android-cn/android-dev-com)
>
>[国内](https://github.com/android-cn/android-dev-cn)
>

---

>**CSDN**

>* 1.[郭霖](http://blog.csdn.net/guolin_blog)
>* 2.[任玉刚](http://blog.csdn.net/singwhatiwanna)
>* 3.[张鸿洋](http://blog.csdn.net/lmj623565791)
>* 4.[罗升阳*](http://blog.csdn.net/Luoshengyang/)

> (PS:*表示Android系统研究)

>**微信公众号**

>* 1.Google开发者（Google_Developers）
>* 2.QQ空间终端开发团队(qzonemobiledev)
>* 3.手机淘宝技术团队MTT（AlibabaMTT）
>* 4.腾讯bugly(weixinBugly)
>* 5.微信移动客户端团队（WeMobileDev）


>**Google+**

>* 1.[JakeWharton(Work@Square)](https://plus.google.com/+JakeWharton)
>* 2.[CyrilMottier](https://plus.google.com/+CyrilMottier)
>* 3.[RomainGuy(Work@Google)](https://plus.google.com/+RomainGuy)
>* 4.[NickButcher(Work@Google)](https://plus.google.com/+NickButcher)

>**公司技术团队**

>* 1.[美团点评技术团队](http://tech.meituan.com/)
>* 2.[Glow 技术团队博客](http://tech.glowing.com/cn/)
>* 3.[蘑菇街技术博客](http://mogu.io/)
>* 4.[腾讯bugly团队](http://bugly.qq.com/blog/)
>* 5.[腾讯ISUX团队](http://isux.tencent.com/)

<h6 id="Canvas">十三.Canvas</h6>
>1.Canvas相关的教程:

>* 1.[Canvas and Drawables(Android官方教程)](http://developer.android.com/guide/topics/graphics/2d-graphics.html)

<h6 id="howToLearn">十四.学习方法/路线总结</h6>
>1.[Android学习进阶路线导航线路](http://blog.csdn.net/qinjuning/article/details/7416208)

>2.[ Android学习路线指南](http://blog.csdn.net/singwhatiwanna/article/details/49560409)

>3.[Android学习之路](http://stormzhang.com/android/2014/07/07/learn-android-from-rookie/)

<h6 id="kotlin">十五.Kotlin</h6>

##参与维护
欢迎Pull Request和使用issue

##LICENCE
MIT

##关于我
网络ID:JohnTsai

Android开发者，手机发烧友。

我的博客:[http://www.johntsai.xyz](http://www.johntsai.xyz)

博客园博客:[http://www.cnblogs.com/JohnTsai](http://www.cnblogs.com/JohnTsai)

邮箱:[JohnTsai.Work#gmail.com](mailto:JohnTsai.Work@gmail.com)

