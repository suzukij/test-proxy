# Demo Spring Boot Application

This repository contains a minimal Spring Boot 3.4 project using Java 21.
It uses Maven for the build, H2 as an in-memory database and integrates
[Doma](https://doma.readthedocs.io/) as the ORM.

## Building the project

Run the following command to build the application:

```bash
mvn clean package
```

## Running the application

```bash
mvn spring-boot:run
```

The application starts on `http://localhost:8080`.
