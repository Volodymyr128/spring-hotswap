Demo:
1. Start HotswaptestApplication.java
2. curl -X GET http://localhost:9001/item
3. Change Controller.java to return different items list
4. Save Controller.java
5. curl -X GET http://localhost:9001/item
6. 2nd and 5th steps should return different output without project restart

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