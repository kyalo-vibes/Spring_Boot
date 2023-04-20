# Microservice for Dog REST endpoint

This simple microservice provides a REST endpoint for dogs and registers itself with a localhost Eureka server. The application is built using Spring Boot, Spring Data REST, Spring Cloud, and an H2 database.

## REST endpoints

The REST endpoint supports the following operations:

- `GET /dogs`: Returns a list of all dogs.
- `GET /dogs/{id}`: Returns a specific dog by ID.
- `POST /dogs`: Creates a new dog.
- `PUT /dogs/{id}`: Updates an existing dog.
- `DELETE /dogs/{id}`: Deletes a dog.

## Eureka server

This microservice registers itself with a localhost Eureka server. The Eureka server can be accessed at `http://localhost:8761`.

## H2 database

This microservice uses an H2 database, which is an in-memory database. This means that any data you add to the database will be lost when you restart the application. If you want to persist data, you will need to configure the application to use a different database.


![Imgur](https://i.imgur.com/Wic6E0H.png)

## Swagger UI

The Swagger UI is a web-based tool that allows you to interact with the API documentation. You can access the Swagger UI by opening the following URL in the web broswer (Microservice on port 8762):

    http://localhost:8762/swagger-ui.html

![Imgur](https://i.imgur.com/SWDGJ8x.png)
