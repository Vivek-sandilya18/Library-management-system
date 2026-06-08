Library Management System
Overview

Library Management System is a backend application built using Java, Spring Boot, and MySQL. The system helps manage library users and track book issue/return records. It uses a One-to-Many relationship where a single user can have multiple book status records.

Features
Add new users
View all users
Update user details
Delete users
Issue books to users
Track issued books
Store issue and return dates
Manage book status records
RESTful API architecture
MySQL database integration
Technologies Used
Java
Spring Boot
Spring Data JPA
Hibernate
MySQL
Maven
REST APIs
Spring Tool Suite (STS)
Postman
Database Structure
Users Table

Stores user information.

Field	Type
id	Integer
user_id	Long
name	String
email	String
Status Table

Stores book issue and return details.

Field	Type
id	Integer
bookId	Integer
bookName	String
issueDate	Date
returnDate	Date
Relationship
One User can have multiple book status records.
Implemented using One-to-Many mapping.
User (1) ------> (Many) Status
API Endpoints
User APIs
POST /users
GET /users
GET /users/{id}
PUT /users/{id}
DELETE /users/{id}
Status APIs
POST /status
GET /status
GET /status/{id}
PUT /status/{id}
DELETE /status/{id}
Project Structure
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
Setup Instructions
Clone the repository
git clone <repository-url>
Configure MySQL database in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/librarydb
spring.datasource.username=root
spring.datasource.password=your_password
Build the project
mvn clean install
Run the application
mvn spring-boot:run
Test APIs using Postman.
Future Enhancements
Authentication and Authorization using JWT
Book inventory management
Fine calculation for late returns
Search and filtering functionality
Admin and User roles
