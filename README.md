# Camunda SubLoop POC

`mvnw spring-boot:run`

[Open](http://localhost:8080)

demo/demo

![BPMN Diagram](sodexo_demo_v1.png )

# Docker Image

```
mvnw spring-boot:build-image

docker run -it -p8080:8080 sub-loop-poc:0.0.1-SNAPSHOT
```