# Food Delivery System

Backend application built with Java and Spring Boot for managing customers, food orders, chefs, and delivery drivers through REST APIs.

## Overview

The Food Delivery System manages the core operations of a food delivery platform using a layered backend architecture.

The application separates responsibilities into controllers, services, repositories, and entities while using Spring Data JPA and MySQL for persistence.

## Key Features

- Customer management
- Chef management
- Delivery driver management
- Order management
- RESTful APIs
- CRUD operations
- MySQL database integration
- Asynchronous order processing
- Asynchronous chef and driver assignment
- Layered architecture

## Architecture

```text
Client / Postman
       ↓
Controller Layer
       ↓
Service Layer
       ↓
Repository Layer
       ↓
MySQL Database
```

**Controller**  
Handles HTTP requests and exposes REST endpoints.

**Service**  
Contains the application's business logic and asynchronous operations.

**Repository**  
Uses Spring Data JPA to communicate with the database.

**Entity**  
Represents the main application data such as customers, chefs, drivers, and orders.

## Main Entities

| Entity | Responsibility |
|---|---|
| Customer | Represents food delivery customers |
| Chef | Handles food preparation |
| Delivery Driver | Handles order delivery |
| Order | Represents customer food orders |

## Technology Stack

| Technology | Purpose |
|---|---|
| Java 17 | Programming language |
| Spring Boot | Backend framework |
| Spring Data JPA | Data access |
| Hibernate | ORM |
| MySQL | Database |
| Maven | Build and dependency management |
| REST API | Client-server communication |
| Postman | API testing |

## API Endpoints

### Orders

```text
POST /orders/place
GET  /orders/allorder
PUT  /orders/updateorder/{orderId}
```

### Chefs

```text
POST /chefs/create
PUT  /chefs/assign/{chefId}/toOrder/{orderId}
PUT  /chefs/completeOrder/{orderId}
```

### Delivery Drivers

```text
POST /drivers/create
GET  /drivers/available
PUT  /drivers/assign/{driverId}/toOrder/{orderId}
PUT  /drivers/completeDelivery/{orderId}
```

## Project Structure

```text
fooddelivery/
├── pom.xml
├── .gitignore
│
└── src/
    ├── main/
    │   ├── java/com/fooddelivery/
    │   │   ├── FooddeliveryApplication.java
    │   │   ├── controller/
    │   │   ├── entity/
    │   │   ├── repository/
    │   │   └── service/
    │   │
    │   └── resources/
    │       └── application.properties
    │
    └── test/
        └── java/com/fooddelivery/
            └── FooddeliveryApplicationTests.java
```

## Getting Started

### Clone the repository

```bash
git clone https://github.com/mukesh7984/Food-delivery-system.git
cd fooddelivery
```

### Configure MySQL

Create a database:

```sql
CREATE DATABASE food_delivery;
```

Configure the database connection in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/food_delivery
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> Do not commit real database credentials to GitHub.

### Run the application

```bash
mvn spring-boot:run
```

The application runs on:

```text
http://localhost:8080
```

## API Testing

The REST APIs can be tested using Postman with standard HTTP methods such as:

```text
GET     → Retrieve data
POST    → Create data
PUT     → Update data
DELETE  → Delete data
```

## Future Enhancements

- Authentication and authorization
- Admin dashboard
- Restaurant and menu management
- Online payment integration
- Real-time delivery tracking
- Order notifications
- React frontend
- Cloud deployment

## Developer

**Mukesh Vijay**

Computer Science and Engineering

[GitHub](https://github.com/mukesh7984)