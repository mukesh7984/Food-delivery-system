\# Food Delivery System



A backend application developed using \*\*Java, Spring Boot, and MySQL\*\* to manage customers, orders, chefs, and delivery drivers through RESTful APIs.



\## Project Overview



The Food Delivery System is a backend application designed to manage the core operations of a food delivery platform.



The project follows a layered architecture that separates application responsibilities into:



\* Controller Layer

\* Service Layer

\* Repository Layer

\* Entity Layer



Spring Boot is used for backend development, Spring Data JPA for database operations, and MySQL for data persistence.



\## Features



\* Customer management

\* Chef management

\* Delivery driver management

\* Order management

\* RESTful API development

\* CRUD operations

\* MySQL database integration

\* Spring Data JPA integration

\* Layered architecture

\* Maven-based project management



\## Technologies Used



| Technology      | Purpose                         |

| --------------- | ------------------------------- |

| Java            | Programming Language            |

| Spring Boot     | Backend Framework               |

| Spring Data JPA | Database Operations             |

| Hibernate       | Object-Relational Mapping       |

| MySQL           | Database                        |

| Maven           | Build and Dependency Management |

| REST API        | Client-Server Communication     |

| Postman         | API Testing                     |

| Git \& GitHub    | Version Control                 |



\## Project Structure



```text

Food-delivery-system/

├── pom.xml

├── .gitignore

├── README.md

│

└── src/

&#x20;   ├── main/

&#x20;   │   ├── java/

&#x20;   │   │   └── com/fooddelivery/

&#x20;   │   │       ├── FooddeliveryApplication.java

&#x20;   │   │       │

&#x20;   │   │       ├── controller/

&#x20;   │   │       │   ├── ChefController.java

&#x20;   │   │       │   ├── DeliveryDriverController.java

&#x20;   │   │       │   └── OrderController.java

&#x20;   │   │       │

&#x20;   │   │       ├── entity/

&#x20;   │   │       │   ├── Chef.java

&#x20;   │   │       │   ├── Customer.java

&#x20;   │   │       │   ├── DeliveryDriver.java

&#x20;   │   │       │   └── Order.java

&#x20;   │   │       │

&#x20;   │   │       ├── repository/

&#x20;   │   │       │   ├── ChefRepository.java

&#x20;   │   │       │   ├── CustomerRepository.java

&#x20;   │   │       │   ├── DeliveryDriverRepository.java

&#x20;   │   │       │   └── OrderRepository.java

&#x20;   │   │       │

&#x20;   │   │       └── service/

&#x20;   │   │           ├── ChefService.java

&#x20;   │   │           ├── CustomerService.java

&#x20;   │   │           ├── DeliveryDriverService.java

&#x20;   │   │           └── OrderService.java

&#x20;   │   │

&#x20;   │   └── resources/

&#x20;   │       └── application.properties

&#x20;   │

&#x20;   └── test/

&#x20;       └── java/

&#x20;           └── com/fooddelivery/

&#x20;               └── FooddeliveryApplicationTests.java

```



\## Application Architecture



```text

Client / Postman

&#x20;      |

&#x20;      v

Controller Layer

&#x20;      |

&#x20;      v

Service Layer

&#x20;      |

&#x20;      v

Repository Layer

&#x20;      |

&#x20;      v

MySQL Database

```



\### Controller Layer



Handles HTTP requests and exposes REST endpoints for different operations.



\### Service Layer



Contains the business logic of the application and acts as an intermediary between controllers and repositories.



\### Repository Layer



Uses Spring Data JPA to perform database operations and communicate with the MySQL database.



\### Entity Layer



Contains Java entity classes that represent the application's database tables.



\## Main Entities



\### Customer



Represents customers who use the food delivery system.



\### Chef



Represents chefs responsible for preparing food orders.



\### Delivery Driver



Represents delivery personnel responsible for delivering customer orders.



\### Order



Represents food orders placed by customers and processed through the delivery system.



\## Setup and Installation



\### 1. Clone the Repository



```bash

git clone https://github.com/mukesh7984/Food-delivery-system.git

```



\### 2. Open the Project



Open the project in an IDE such as:



\* IntelliJ IDEA

\* Eclipse

\* Spring Tool Suite

\* Visual Studio Code



\### 3. Configure MySQL



Create a MySQL database.



```sql

CREATE DATABASE food\_delivery;

```



\### 4. Configure Database Connection



Open:



```text

src/main/resources/application.properties

```



Configure your MySQL connection details.



Example:



```properties

spring.datasource.url=jdbc:mysql://localhost:3306/food\_delivery

spring.datasource.username=root

spring.datasource.password=YOUR\_PASSWORD



spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

```



> \*\*Security:\*\* Do not commit your actual database password or other sensitive credentials to GitHub.



\### 5. Run the Application



Using Maven:



```bash

mvn spring-boot:run

```



Alternatively, run `FooddeliveryApplication.java` directly from your IDE.



The application will normally run at:



```text

http://localhost:8080

```



\## API Testing



The REST APIs can be tested using Postman.



Common HTTP methods used in REST APIs include:



| Method | Purpose              |

| ------ | -------------------- |

| GET    | Retrieve data        |

| POST   | Create new data      |

| PUT    | Update existing data |

| DELETE | Delete data          |



\## Learning Outcomes



This project provided practical experience with:



\* Java backend development

\* Spring Boot

\* REST API development

\* Spring Data JPA

\* Hibernate

\* MySQL

\* CRUD operations

\* Layered architecture

\* Maven

\* Postman API testing

\* Git and GitHub



\## Future Enhancements



Possible future improvements include:



\* User authentication and authorization

\* Admin dashboard

\* Restaurant and menu management

\* Online payment integration

\* Real-time delivery tracking

\* Order status notifications

\* React-based frontend

\* Cloud deployment



\## Developer



\*\*Mukesh Vijay\*\*



Computer Science and Engineering



GitHub: https://github.com/mukesh7984



\---





