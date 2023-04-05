FROM openjdk:17-jdk-alpine
WORKDIR /app
EXPOSE 8080
ADD target/github-ci-cd-demo-0.0.1-SNAPSHOT.jar /github-ci-cd-demo.jar
ENTRYPOINT ["java","-jar","/github-ci-cd-demo.jar"]