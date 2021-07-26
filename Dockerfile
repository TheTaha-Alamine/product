FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=*.jar
VOLUME /tmp
COPY /build/libs/*-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "application.jar"]