FROM openjdk:19
EXPOSE 8080
ADD target/awsecrdockercodebuild.jar awsecrdockercodebuild.jar
ENTRYPOINT ["java","-jar","/awsecrdockercodebuild.jar"]