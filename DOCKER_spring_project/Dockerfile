FROM java:8

ARG JAR_FILE=target/example-service.jar

COPY ${JAR_FILE} app.jar

EXPOSE 3030

ENTRYPOINT ["java","-jar","app.jar"]