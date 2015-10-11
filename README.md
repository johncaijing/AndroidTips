# AndroidTips
A collections of tips in Android developing.

##前言
我们在日常开发中，会遇到各种各样的问题，或大或小。正是通过解决这些问题，使得我们的开发技能得到进步。养成记录的好习惯，方便自己日后查看，也方便广大开发者能找到自己遇到的问题的解决方案。

PS：持续更新中(last update date:2015/10/11)

##目录
>[一.模拟器](#genymotion)

##正文
<span id="genymotion">一.模拟器</span>

1.genymotion模拟器如何锁屏？
>答：在模拟器的设置-->安全-->屏幕锁定-->选择除<**无**>以外的其他选项。
       然后点击模拟器的电源按钮即可锁屏（或在命令行中输入```adb shell keyevent 26```原理和按电源键一样，模拟电源键点击事件）
       
 参考链接：[http://stackoverflow.com/questions/29292060/how-to-lock-genymotion](http://stackoverflow.com/questions/29292060/how-to-lock-genymotion)
