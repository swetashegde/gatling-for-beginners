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
```/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"```

##### 2. Install Java and set $JAVA_HOME
If you do not have java on your system refer https://java.com/en/download/help/mac_install.xml to install the same.
You can get JDK using Homebrew cask.

Next step is to set your JAVA_HOME:
To see if your $JAVA_HOME is set go to your Mac terminal and run following command

```sh
$ echo $JAVA_HOME
```

If the above command shows nothing, either you have not set your $JAVA_HOME or you have not sourced it.

To set $JAVA_HOME:
Open your bash profile

```sh
$ vi ~/.bash_profile
```
Add $JAVA_HOME variable
$JAVA_HOME =/Library/Java/JavaVirtualMachines/<your jdk version>/Contents/Home


To source your bash_profile:

```sh
$ source ~/.bash_profile
```

You can again run 
```sh
$ echo $JAVA_HOME
```
to see if the $JAVA_HOME is set.


##### 3. Install gradle
We have installed using homebrew

```sh
$ brew install gradle
```


##### 4. Install the IDE
We have used community edition of Intellij from https://www.jetbrains.com/idea/


##### 5. Add Scala plugin to IDE
