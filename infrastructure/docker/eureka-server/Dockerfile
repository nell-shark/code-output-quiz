# Build stage
FROM gradle:8.14.2-jdk21-alpine AS build

WORKDIR /app

COPY build.gradle.kts settings.gradle.kts gradle ./

COPY eureka-server/build.gradle.kts ./eureka-server/build.gradle.kts

RUN gradle --no-daemon :eureka-server:dependencies

COPY eureka-server/src ./eureka-server/src

RUN gradle --no-daemon :eureka-server:bootJar

# Run stage
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /app/eureka-server/build/libs/*.jar ./eureka-server.jar

ENTRYPOINT ["java", "-jar", "eureka-server.jar"]
