FROM java:openjdk-8-alpine

WORKDIR /src/todoApp/

COPY  /build/libs/ .

CMD ["java", "-jar", "./todo-0.0.1-SNAPSHOT.jar"]
