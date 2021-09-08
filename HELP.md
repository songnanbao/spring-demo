# Getting Started

- (Windows) Make sure the local service: `postgresql-x64` is enabled in the Task Manager
- Create new PostgreSQL DB connection at 
 > localhost:5432

   with username: `postgres` and password: `admin`
- Create new DB table `demo`
- Run SpringBoot project by Maven command: 
> $ mvn spring-boot:run

- Access the index web page by URL:
> http://localhost

or
> http://localhost/index

- In case of project not being closed properly (`Port 8080 already in use`), use the following command to terminate the process in Windows:
> $ netstat -ano | findstr 80

> $ taskkill /F /pid xxxx
 
## Endpoint Examples:

### Student
> POST http://localhost/student/

Headers:
`Content-Type`: `application/json`

Body:
```json
{ "firstname":"AAA", "lastname":"BBB", "sex":0 }
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-developing-web-applications)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Jersey](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-jersey)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

