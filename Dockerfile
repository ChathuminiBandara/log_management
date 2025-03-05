# base images
FROM openjdk:17-jdk-slim

# app - customizeble name
ADD target/Hello_JAR.jar app.jar

# Expose the port that app will run on container
EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]