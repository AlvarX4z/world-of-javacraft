FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080
RUN mkdir -p /app/

# Path located in build/libs/*.jar
ADD build/libs/world-of-javacraft.jar /app/world-of-javacraft.jar

ENTRYPOINT ["java", "-jar", "/app/world-of-javacraft.jar"]
