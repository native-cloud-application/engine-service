FROM java:8
EXPOSE 8080
ADD /target/engine-service.jar engine-service.jar
ENTRYPOINT ["java","-jar","engine-service.jar"]

