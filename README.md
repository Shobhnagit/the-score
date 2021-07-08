# the-score
theScore App automation for Android

**Prerequisites**

1. Download Java 1.8.0

2. Download Android Studio and look for Android SDK

3. Set Environment variables Path for Java, Android SDK and Node in Mac System variables

4. Configure Android virtual emulator in Android Studio

5. Download Appium Desktop Server

6. Install Editor/Eclipse

7. Setup Maven project in Eclipse and add Appium java-Client, TestNG and Selenium-java dependencies in pom.xml file

8. Add Configuration in maven-surefire-plugin if you want to run TestNG xml file using Maven commands

```xml
        <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.0.0-M5</version>
        <configuration>
          <suiteXmlFiles>
            <suiteXmlFile>testng.xml</suiteXmlFile>
          </suiteXmlFiles>
        </configuration>
        </plugin>

```

---



**Running code from Command line/Terminal**

- Open Appium Desktop and start server

- For opening your emulator from terminal/command line write following commands

   ``` zsh
   cd /Users/Sob/Library/Android/sdk/emulator
   emulator -list-avds
   emulator ./emulator -avd emulatorName

   ```


- Maven Command to Run code from Termial/CommandLine
  
  ```zsh
  
  cd /Users/Sob/eclipse-workspace/theScoreAutomation 
  mvn clean
  mvn compile
  mvn test
  
  ```
