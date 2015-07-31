FROM java:8-jre
ADD build/libs/Identity-service.jar app.jar
RUN touch app.jar
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
