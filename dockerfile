FROM openjdk:17-jdk-alpine

RUN mkdir /files

COPY target/SpringSecurityJWT-0.0.1-SNAPSHOT.jar Spring_Security_JWT.jar

RUN chmod -R 777 /files

WORKDIR /

ENTRYPOINT ["java", "-jar", "/Spring_Security_JWT.jar"]