FROM openjdk:11

EXPOSE 8089

ADD ./target/wiremind-0.0.1-SNAPSHOT.jar wiremind-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "wiremind-0.0.1-SNAPSHOT.jar"]
