
FROM amazoncorretto:20-alpine-jdk
COPY target/Backend-0.0.1-SNAPSHOT.jar backend.jar
ENTRYPOINT ["java","-jar","/backend.jar"]