FROM java:8

ARG JAR_FILE=target/abdulra.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8090

ENTRYPOINT ["java","-jar","app.jar"]