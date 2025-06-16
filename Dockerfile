
# Stage 1: BUILD THE APPLICATION
FROM eclipse-temurin:17-jdk AS builder

# WORKING DIRECTORY
WORKDIR /app

# Copy application code
COPY . .

# Dar permisos de ejecución al mvnw
RUN chmod +x ./mvnw

# Create package in maven
RUN ./mvnw clean package -DskipTests

# Stage 2: RUN THE APPLICATION (PRODUCTION)
FROM eclipse-temurin:17-jre

# WORKING DIRECTORY
WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# El puerto en el que corre la aplicación
EXPOSE 19090

# Comando para correr la aplicación
ENTRYPOINT ["java","-jar","app.jar"]