FROM openjdk:19
WORKDIR /app
COPY target/analytics-0.0.1-SNAPSHOT.jar /app
EXPOSE 8083
CMD ["java", "-jar", "/app/analytics-0.0.1-SNAPSHOT.jar"]