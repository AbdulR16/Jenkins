FROM java:8

ARG JAR_FILE=target/ashwina.jar

COPY ${JAR_FILE} app.jar

EXPOSE 7050

ENTRYPOINT ["java","-jar","app.jar"]