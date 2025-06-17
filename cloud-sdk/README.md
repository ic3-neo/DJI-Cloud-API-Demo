# How to connect to CloudSDK
### 1. Add the package name: com.dji.sdk in the component scan
### [2. Connect to MQTT](#How to connect to MQTT)
### [3. Implement SDK methods](#How to implement SDK methods)
### [4. Call SDK methods](#How to call SDK methods)

## How to connect to MQTT
- Inject MqttConnectOptions and MqttPahoClientFactory into the spring container;
![1](./image/6.png)

- Configure cloud-sdk.mqtt.inbound-topic in application.yml. If not configured, no initial subscription will be performed.

## How to implement SDK methods
- Define a class that inherits the abstract class in the com.dji.sdk.cloudapi.*.api package;
- Rewrite specific methods to implement functions;
- Put the defined class into the spring container, and let spring manage the bean life cycle.
### [Device Online] Example:
- Define a class: SDKDeviceService inherits AbstractDeviceService;
![1](./image/1.png)
- Rewrite the updateTopoOnline method to implement the device online function.
![1](./image/2.png)

## How to call SDK methods
- Define a class that inherits the abstract class in the com.dji.sdk.cloudapi.*.api package;
- Inject the class into the class that needs to be called;
- Call a specific method.
### [Pre-issuing route command] Example:
- Define a class: SDKWaylineService inherits AbstractWaylineService;
![1](./image/3.png)
- Inject this class into WaylineJobServiceImpl;
![1](./image/4.png)
- Call the method to issue the command:
![1](./image/5.png)

## How to implement the http interface defined by CloudAPI
- Define a class to implement the http interface class in the com.dji.sdk.cloudapi.*.api package;
- Rewrite the specific method to implement the interface without defining data such as the request address and method.
![1](./image/7.png)

## How to view all http interfaces defined by CloudAPI
- Start the program
- Open the browser: http://localhost:6789/swagger-ui/index.html

## How to access WebSocket
- ​​CloudSDK has defined the WebSocket service, but has not implemented WebSocket management. The default address is: http://localhost:6789/api/v1/ws
- Custom access reference: com.dji.sample.component.websocket.config
