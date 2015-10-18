# AndroidTips
A collections of tips in Android developing.

##前言
我们在日常开发中，会遇到各种各样的问题，或大或小。正是通过解决这些问题，使得我们的开发技能得到进步。养成记录的好习惯，方便自己日后查看，也方便广大开发者能找到自己遇到的问题的解决方案。

PS：持续更新中(last update date:2015/10/18)

##目录
>[一.模拟器](#genymotion)

>[二.Android Studio](#AndroidStudio)

>[三.Gradle](#Gradle)

>[四.资源混淆](#resourceMix)

##正文
<h6 id="genymotion">一.模拟器</h6>

1.genymotion模拟器如何锁屏？
>答：在模拟器的设置-->安全-->屏幕锁定-->选择除<**无**>以外的其他选项。
       然后点击模拟器的电源按钮即可锁屏（或在命令行中输入```adb shell keyevent 26```原理和按电源键一样，模拟电源键点击事件）
       
 参考链接：[http://stackoverflow.com/questions/29292060/how-to-lock-genymotion](http://stackoverflow.com/questions/29292060/how-to-lock-genymotion)
 
 2.genymotion模拟器如何打开输入法软键盘？
 >答：在设置输入法选项中，关闭物理键盘即可。（如下图所示）
 
 ![](http://ww3.sinaimg.cn/mw690/8942f980gw1ewy3xga2uqj20om144dk6.jpg)
 
 
<h6 id="AndroidStudio">二.Android Studio</h6>
1.Andorid Studio中有哪些好用的插件？
>答: 

>1>.[GsonFormat](https://github.com/zzz40500/GsonFormat):用json数据一键生成JavaBeans

>2>. [ADB Idea](https://github.com/pbreault/adb-idea)：ctrl + Shift + A 查找中添加常用卸载安装app的一些操作，无需命令行

> 3>.[android-parcelable-intellij-plugin](https://github.com/mcharmas/android-parcelable-intellij-plugin) 快速实现parcelable序列化

> 4>.[android-butterknife-zelezny](https://github.com/avast/android-butterknife-zelezny) ButterKnife生成器，快速生成View声明代码

2.Android Studio提升效率的技巧文章
>答:

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-1/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-1/)

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-2/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-2/)

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-3/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-3/)

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-4/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-4/)

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-5/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-5/)

>[http://www.developerphil.com/android-studio-tips-of-the-day-roundup-6/](http://www.developerphil.com/android-studio-tips-of-the-day-roundup-6/)

<h6 id="Gradle">三.Gradle</h6>
1.Gradle有什么教程?

>答:

>1.[Gradle User Guide 中文版](https://dongchuan.gitbooks.io/gradle-user-guide-/content/)

>2.[Gradle官方教程](https://docs.gradle.org/current/userguide/userguide.html)

>3.[灵活强大的构建系统Gradle（美团技术团队）](http://tech.meituan.com/gradle-practice.html)

>4.[Android官方Gradle教程](https://developer.android.com/intl/zh-cn/tools/building/plugin-for-gradle.html)

>5.[Gradle官方Training](http://gradle.org/getting-started-android/)

<h6 id="resourceMix">四.资源混淆</h6>
1.资源混淆有什么好的技术文章?

>答:

>1.[美团Android资源混淆保护实践](http://tech.meituan.com/mt-android-resource-obfuscation.html)

>2.[安装包立减1M--微信Android资源混淆打包工具](http://mp.weixin.qq.com/s?__biz=MzAwNDY1ODY2OQ==&mid=208135658&idx=1&sn=ac9bd6b4927e9e82f9fa14e396183a8f&scene=23&srcid=1012zDgw2RHFIoV0NLKVHhbT#rd)

