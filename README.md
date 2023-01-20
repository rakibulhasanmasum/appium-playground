# Operating System
## MAC
### Tools
- Appium Server Gui
- Appium Inspector
- Android Studio

### Setup
#### Appium Server Gui
##### Configurations
- ANDROID_HOME **/Users/r_hasan/Library/Android/sdk/**
- JAVA_HOME **/usr/bin/java**
##### Advance
- Server Address **localhost**
- Port **4723**
- Allow CORS
#### Appium Inspector
##### Appium Server
- Remote Host **localhost**
- Remote Port **4723**
- Remote Path **/wd/hub**
##### Desired Capabilities
###### JSON Representation
````json
{
    "appium:app": "//Users//r_hasan//Desktop//appium-starter//src//main//resources//TLOps_7August2022_Local.apk",
    "appium:deviceName": "Pixel 4 API 33",
    "platformName": "android",
    "appium:automationName": "UIAutomator2"
}