# System setup steps
 
### System requirements
1. Homebrew (Package Manager for Mac)
2. Java.
3. Gradle - We are using gradle build tool for this project.
4. Any IDE - to make life simpler. We are using Intellij.
5. Add Scala plug in.

## Steps for setting up Macs
##### 1. Install Homebrew
Run this command on the terminal:
```sh
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

##### 2. Install Java and 
Now that you have homebrew,you can get JDK using Homebrew cask.


```sh
$ brew cask install java
```



##### 3. Install gradle
We have installed using homebrew

```sh
$ brew install gradle
```


##### 4. Install the IDE
We have used community edition of Intellij from https://www.jetbrains.com/idea/


##### 5. Add Scala plugin to IDE 
On Startup IntelliJ gives an option to add Scala plugin. You can check it and install on launching IntelliJ for the first time.
Otherwise, as soon as you add "apply plugin: "scala" in your build.gradle, IntelliJ prompts you to download scala plugin.
