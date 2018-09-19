siddhi-io-websocket
======================================

The **siddhi-io-websocket extension** is an extension to <a target="_blank" href="https://wso2.github.io/siddhi">Siddhi</a>
  that allows to receive and publish events through WebSocket.

Find some useful links below:

* <a target="_blank" href="https://github.com/wso2-extensions/siddhi-io-websocket">Source code</a>
* <a target="_blank" href="https://github.com/wso2-extensions/siddhi-io-websocket/releases">Releases</a>
* <a target="_blank" href="https://github.com/wso2-extensions/siddhi-io-websocket/issues">Issue tracker</a>

## Latest API Docs 

Latest API Docs is <a target="_blank" href="https://wso2-extensions.github.io/siddhi-io-websocket/api/1.0.11">1.0.11</a>.

## How to use 

**Using the extension in <a target="_blank" href="https://github.com/wso2/product-sp">WSO2 Stream Processor</a>**

* You can use this extension in the latest <a target="_blank" href="https://github.com/wso2/product-sp/releases">WSO2 Stream Processor</a> that is a part of <a target="_blank" href="http://wso2.com/analytics?utm_source=gitanalytics&utm_campaign=gitanalytics_Jul17">WSO2 Analytics</a> offering, with editor, debugger and simulation support. 

* This extension is shipped by default with WSO2 Stream Processor, if you wish to use an alternative version of this extension you can replace the component <a target="_blank" href="https://github.com/wso2-extensions/siddhi-io-websocket/releases">jar</a> that can be found in the `<STREAM_PROCESSOR_HOME>/lib` directory.

**Using the extension as a <a target="_blank" href="https://wso2.github.io/siddhi/documentation/running-as-a-java-library">java library</a>**

* This extension can be added as a maven dependency along with other Siddhi dependencies to your project.

```
     <dependency>
        <groupId>org.wso2.extension.siddhi.io.websocket</groupId>
        <artifactId>siddhi-io-websocket</artifactId>
        <version>x.x.x</version>
     </dependency>
```

## Jenkins Build Status

---

|  Branch | Build Status |
| :------ |:------------ | 
| master  | [![Build Status](https://wso2.org/jenkins/job/siddhi/job/siddhi-io-websocket/badge/icon)](https://wso2.org/jenkins/job/siddhi/job/siddhi-io-websocket/) |

---

## Features

* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-io-websocket/api/1.0.11/#websocket-sink">websocket</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#sink">(Sink)</a>*<br><div style="padding-left: 1em;"><p>A Siddhi application can be configured to publish events via the Websocket transport by adding the @Sink(type = 'websocket') annotation at the top of an event stream definition.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-io-websocket/api/1.0.11/#websocket-server-sink">websocket-server</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#sink">(Sink)</a>*<br><div style="padding-left: 1em;"><p>A Siddhi application can be configured to publish events via the WebSocket transport by adding the @Sink(type = 'websocket-server') annotation at the top of an event stream definition.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-io-websocket/api/1.0.11/#websocket-source">websocket</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#source">(Source)</a>*<br><div style="padding-left: 1em;"><p>A Siddhi application can be configured to receive events via the WebSocket by adding the @Source(type = 'websocket') annotation at the top of an event stream definition.<br>When this is defined the associated stream will receive events from the WebSocket server on the url defined in the system.</p></div>
* <a target="_blank" href="https://wso2-extensions.github.io/siddhi-io-websocket/api/1.0.11/#websocket-server-source">websocket-server</a> *<a target="_blank" href="https://wso2.github.io/siddhi/documentation/siddhi-4.0/#source">(Source)</a>*<br><div style="padding-left: 1em;"><p>A Siddhi application can be configured to receive events via the WebSocket by adding the @Source(type = 'websocket-server') annotation at the top of an event stream definition.</p></div>

## How to Contribute
 
  * Please report issues at <a target="_blank" href="https://github.com/wso2-extensions/siddhi-io-websocket/issues">GitHub Issue Tracker</a>.
  
  * Send your contributions as pull requests to <a target="_blank" href="https://github.com/wso2-extensions/siddhi-io-websocket/tree/master">master branch</a>. 
 
## Contact us 

 * Post your questions with the <a target="_blank" href="http://stackoverflow.com/search?q=siddhi">"Siddhi"</a> tag in <a target="_blank" href="http://stackoverflow.com/search?q=siddhi">Stackoverflow</a>. 
 
 * Siddhi developers can be contacted via the mailing lists:
 
    Developers List   : [dev@wso2.org](mailto:dev@wso2.org)
    
    Architecture List : [architecture@wso2.org](mailto:architecture@wso2.org)
 
## Support 

* We are committed to ensuring support for this extension in production. Our unique approach ensures that all support leverages our open development methodology and is provided by the very same engineers who build the technology. 

* For more details and to take advantage of this unique opportunity contact us via <a target="_blank" href="http://wso2.com/support?utm_source=gitanalytics&utm_campaign=gitanalytics_Jul17">http://wso2.com/support/</a>. 
