FROM azul/zulu-openjdk-alpine:17-latest AS build
COPY build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]