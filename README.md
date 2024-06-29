# Student_Management_Project

<h2>Project Overview</h2></br>
This project is a simple web application that allows users to manage student information through basic CRUD operations. It demonstrates the core functionalities of Spring Boot in handling data and building using Spring data jpa.</br>

#IDE/Version :</br>

Java 21</br>
STS 3.3.0</br>

<h2>We perform:</h2>

show data on home page
enter new student data
edit student data from database
delete student data from database

<h2>Add Dependency:</h2>

Spring Boot DevTools
Lombok
Spring Data Jpa
MySQL Driver
Thymeleaf
Spring Web

<h2>Key Features</h2>
Create Student:

Endpoint to add new student records.
Capture details such as name, age, class, and contact information.
Read Student:

Endpoint to retrieve a list of all students.
Endpoint to retrieve a specific student by ID.
Update Student:

Endpoint to update the details of an existing student by ID.
Delete Student:

Endpoint to delete a student record by ID.
Technology Stack
Backend: Spring Boot
Database: H2 (in-memory for simplicity), MySQL, or PostgreSQL
Build Tool: Maven or Gradle
RESTful API: Exposing endpoints for CRUD operations
Project Structure
Model:

Define a Student entity class with attributes like id, name, age, class, and contact.
Repository:

Create a StudentRepository interface extending JpaRepository for database operations.
Service:

Implement a StudentService class to handle business logic for CRUD operations.
Controller:

Develop a StudentController class to map HTTP requests to service methods.

