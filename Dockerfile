FROM maven:3.6.3-jdk-11-slim@sha256:68ce1cd457891f48d1e137c7d6a4493f60843e84c9e2634e3df1d3d5b381d36c
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/pykube-tech-0.0.1-SNAPSHOT.jar 
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]