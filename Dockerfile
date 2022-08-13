FROM openjdk:11
EXPOSE 8080
COPY target/lastpick-0.0.1-SNAPSHOT.jar lastpick-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "lastpick-0.0.1-SNAPSHOT.jar"]