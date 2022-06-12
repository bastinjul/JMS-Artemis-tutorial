FROM eclipse-temurin:17-alpine

EXPOSE 8080

COPY target/jms_tuto_backend-*.jar /jms_tuto_backend.jar

ENTRYPOINT [ "java", "-jar", "/jms_tuto_backend.jar" ]