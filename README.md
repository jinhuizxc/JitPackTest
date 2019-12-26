# JitPack上传自己的开源库

在JitPack中发布自己library

官方文档：https://jitpack.io/docs/ANDROID/

总结：
- 1.在root的build.gradle文件中加入
```
buildscript { 
  dependencies {
    classpath 'com.github.dcendents:android-maven-gradle-plugin:1.5' // Add this line
}
```

- 2.在library的build.gradle中加入
```
apply plugin: 'com.github.dcendents.android-maven'
group='com.github.YourUsername' //group='com.github.jinhuizxc'
```

- 3.下面这一步要注意
下面检查你的Project目录是否存在 gradle/wrapper/gradle-wrapper.jar、gradle-wrapper.properties 这两个文件（一般都是没有的），如果存在可跳过下面这步，如果不存在，请按下面的进行操作。打开当前项目的 Terminal面板，先后执行 gradle wrapper 和 ./gradlew install 两个命令

- 4.将自己的项目传到Github上

- 5.下面这步很重要！在Github上的release这里新建一个版本
这一步不做的话会导致发布失败的！



## 参考文章
- [实现自己的开源库----JitPack使用体验](https://www.jianshu.com/p/9218d34fb8fa?utm_campaign=haruki&utm_content=note&utm_medium=reader_share&utm_source=weixin)
- [Jitpack](https://www.jitpack.io/)
- [Android Studio 将module打成jar包](https://www.2cto.com/kf/201702/603138.html)
- [AndroidStudio项目打包成jar](https://www.cnblogs.com/xxdh/p/6703746.html)
