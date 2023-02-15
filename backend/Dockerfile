# Use official Maven Docker image (v3.8.1) with OpenJDK 17 on slim Linux distro for build
FROM maven:3.8.1-openjdk-17-slim AS build

# Copy app source code to /app/src directory
COPY src /app/src

# Copy POM file to /app directory
COPY pom.xml /app

# Build app by running "mvn clean package" command on POM file
RUN mvn -f /app/pom.xml clean package

# Use official OpenJDK Docker image (v17) on slim Linux distro for package
FROM openjdk:17-slim

# Copy compiled JAR file from build stage to /usr/local/lib directory
COPY --from=build /app/target/*.jar /usr/local/lib/textNote.jar

# Expose port 8080 for app
EXPOSE 8080

# Set entry point for container to start app
ENTRYPOINT ["java","-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}","-jar","/usr/local/lib/textNote.jar"]
