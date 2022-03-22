FROM java:8

ARG JAR_FILE=target/eurekaabdul.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8761

ENTRYPOINT ["java","-jar","app.jar"]