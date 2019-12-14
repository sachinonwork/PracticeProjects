FROM openjdk:9-jre
ENV MONGO_URL mongodb://localhost/belfastjug_sample_01
EXPOSE 8080

VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

