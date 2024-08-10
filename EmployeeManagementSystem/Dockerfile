# Use a base image with Java runtime
FROM openjdk:11-jre-slim

# Copy the packaged JAR file into the container
COPY target/EmployeeManagementSystem-1.0.0.jar EmployeeManagementSystem-1.0.0.jar

# Expose the port that your Spring Boot application runs on
EXPOSE 8080

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "EmployeeManagementSystem-1.0.0.jar"]