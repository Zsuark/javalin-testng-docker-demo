FROM openjdk:8-jre-alpine

EXPOSE 7000
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/javalin/demo.jar"]

ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/javalin/demo.jar
