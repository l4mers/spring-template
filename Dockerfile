FROM eclipse-temurin:21-ubi9-minimal

VOLUME /tmp
ARG JAR_FILE=build/libs/spring-template-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
COPY entrypoint.sh entrypoint.sh
#EXPOSE 8080
RUN chmod +x ./entrypoint.sh
ENTRYPOINT ["./entrypoint.sh"]
#ENTRYPOINT ["java","-jar","/app.jar"]