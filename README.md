# The Spring-Boot Project

[![CodeQL](https://github.com/d4rkr0n1n-tech/the-spring-boot-project/actions/workflows/codeql.yml/badge.svg)](https://github.com/d4rkr0n1n-tech/the-spring-boot-project/actions/workflows/codeql.yml)

## Project Structure

```lua
.
├── .github
│   ├── workflows
│   │   └── codeql.yml
│   └── dependabot.yml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── d4rkr0n1n
│   │   │           └── project
│   │   │               ├── controller
│   │   │               │   └── UserController.java
│   │   │               ├── data
│   │   │               │   └── UserRepository.java
│   │   │               ├── model
│   │   │               │   └── User.java
│   │   │               ├── service
│   │   │               │   └── UserService.java
│   │   │               └── Application.java
│   │   └── resources
│   │       └── application.yml
│   └── test
│       └── java
│           └── com
│               └── d4rkr0n1n
│                   └── project
│                       ├── controller
│                       │   └── UserControllerTest.java
│                       ├── data
│                       │   └── UserRepositoryTest.java
│                       ├── model
│                       │   └── UserTest.java
│                       ├── service
│                       │   └── UserServiceTest.java
│                       └── ApplicationTests.java
├── .gitignore
├── LICENSE
├── pom.xml
└── README.md
```

## Important Commands

### Run Application

`mvn spring-boot:run`

### Run Tests

`mvn test`
