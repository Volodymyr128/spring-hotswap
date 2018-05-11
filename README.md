Multi-module maven setup and hot reload demo #1: add core module to base classloader and item module to restart classloader:
1. Start HotswaptestApplication.java (and never restart it to the end of the demo!)
2. curl -X GET http://localhost:9001/item. See results. Results depends on two modules: item (Controller.java) and core (ItemService.java)
3. Change Controller.java to return different result
4. cd item/ && mvn clean install  // this should cause logs about auto restarting you Spring app
5. curl -X GET http://localhost:9001/item. See results, they should be changed
6. Change ItemService.java to return different results.
7. cd core/ && mvn clean install
8. curl -X GET http://localhost:9001/item. See results, they should NOT be changed, due to core/src/main/resources/META-INF/spring-devtools.properties

Important note:
It's not enough to change file to achieve hot swap with Spring devtools. You have to change classpath (.class file), means re-build project
To enable  project rebuild on Cmd+Save on Intellij (Eclipse automatically change classpath on Cmd+Save) do:
1. Press Ctrl+Shift+A
2. Search for Registry ...
3. Scroll and find "compiler.automake.allow.when.app.running" then select the checkbox to make it active.
4. Click close
5. File Menu -> settings ...
6. Expand Build, Execution, Deployment
7. Select Compile
8. Select checkbox Build project automatically
9. Apply
10 Click Ok