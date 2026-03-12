FROM azul/zulu-openjdk-alpine:17-latest AS build
COPY build/libs/*.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]