# CHRONICLE REMOTING DEMO
## Chronicle family
Chronicle wire, queue, and map
Wire is a serialization mechanism which stores data in off heap buffer.
Queue and Map are in process shareble off heap data structures.
https://www.infoq.com/articles/billions-messages-minute/

## Demo
Shows how to use Chronicle high performance off heap storage to use with Java, along with remoting.
For remoting, java.net ServerSocket and Socket are used.

I am using Java21. So be sure to add appropriate vmargs regarding Java modules requirement as below.

     --add-exports=java.base/jdk.internal.ref=ALL-UNNAMED --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED --add-opens=jdk.compiler/com.sun.tools.javac=ALL-UNNAMED --add-exports=jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED

I am using vscode, so the args are in .vscode/launch.json
In IntelliJ, put in appropriate launch configuration under run -> edit configuration.

For extensive discussion on --add-exports and --add-opens, see this: https://stackoverflow.com/questions/44056405/whats-the-difference-between-add-exports-and-add-opens-in-java-9/78286218#78286218