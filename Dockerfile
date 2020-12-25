FROM openjdk:8-alpine
ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} service-cars.jar
ENTRYPOINT ["java","-jar","/service-cars.jar"]