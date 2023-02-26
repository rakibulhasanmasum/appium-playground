# Operating System
## ANDROID

#### Appium Server Gui
##### Configurations
- ANDROID_HOME **/home/mdrakibulhasan/Android/Sdk**
- JAVA_HOME **/usr/bin/java**
##### Advance
- Server Address **localhost**
- Port **4723**
- Allow CORS

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
`{
    "appium:app": "/run/media/mdrakibulhasan/IF/trucklagbe_qa/appium-playground/src/main/resources/TL_OPS_19jan2023.apk",
    "appium:deviceName": "TestBethi",
    "platformName": "android",
    "appium:automationName": "UIAutomator2"
}`
