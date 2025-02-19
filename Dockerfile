FROM amazoncorretto:21

EXPOSE 9000
WORKDIR /app

COPY springbootapi-0.0.1-SNAPSHOT.jar /app/springbootapi-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar" ,"springbootapi-0.0.1-SNAPSHOT.jar"]
