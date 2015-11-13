# AndroidTips
A collections of tips in Android developing.

##前言
我们在日常开发中，会遇到各种各样的问题，或大或小。正是通过解决这些问题，使得我们的开发技能得到进步。养成记录的好习惯，方便自己日后查看，也方便广大开发者能找到自己遇到的问题的解决方案。

PS：持续更新中(last update date:2015/11/13)

##目录
>[一.模拟器](#genymotion)

>[二.Android Studio](#AndroidStudio)

>[三.Gradle](#Gradle)

>[四.资源混淆](#resourceMix)

>[五.动画](#animation)

>[六.View](#View)

##正文
<h6 id="genymotion">一.模拟器</h6>

1.genymotion模拟器如何锁屏？
>答：在模拟器的设置-->安全-->屏幕锁定-->选择除<**无**>以外的其他选项。
       然后点击模拟器的电源按钮即可锁屏（或在命令行中输入```adb shell keyevent 26```原理和按电源键一样，模拟电源键点击事件）
       
 参考链接：[http://stackoverflow.com/questions/29292060/how-to-lock-genymotion](http://stackoverflow.com/questions/29292060/how-to-lock-genymotion)
 
 2.genymotion模拟器如何打开输入法软键盘？
 >答：在设置输入法选项中，关闭物理键盘即可。（如下图所示）
 
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

<h6 id="Gradle">三.Gradle</h6>
1.Gradle有什么教程?

>答:

>1.[Gradle User Guide 中文版](https://dongchuan.gitbooks.io/gradle-user-guide-/content/)

>2.[Gradle官方教程](https://docs.gradle.org/current/userguide/userguide.html)

>3.[灵活强大的构建系统Gradle（美团技术团队）](http://tech.meituan.com/gradle-practice.html)

>4.[Android官方Gradle教程](https://developer.android.com/intl/zh-cn/tools/building/plugin-for-gradle.html)

>5.[Gradle官方Training](http://gradle.org/getting-started-android/)

>6.[android-studio.org的Gradle教程](http://ask.android-studio.org/?/explore/category-gradle)

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

<h6 id="View">六.View</h6>
1.View是如何绘制的？
>1.[How Android Draws Views](http://developer.android.com/intl/zh-cn/guide/topics/ui/how-android-draws.html)

>2.[Android视图状态及重绘流程分析，带你一步步深入了解View(一)](http://blog.csdn.net/guolin_blog/article/details/12921889)

>3.[Android视图状态及重绘流程分析，带你一步步深入了解View(二)](http://blog.csdn.net/guolin_blog/article/details/16330267)

>4.[Android视图状态及重绘流程分析，带你一步步深入了解View(三)](http://blog.csdn.net/guolin_blog/article/details/17045157)

>5.[Android视图状态及重绘流程分析，带你一步步深入了解View(四)](http://blog.csdn.net/guolin_blog/article/details/17357967)

