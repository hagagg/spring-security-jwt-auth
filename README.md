# Spring Security JWT Authentication API

A REST API built with Spring Boot that implements JWT-based authentication and authorization using Spring Security.

## Features

- User registration and login
- JWT token generation and validation
- Stateless authentication
- Secure endpoints with role-based access
- BCrypt password encoding
- Student management endpoints (demo)

## Technologies Used

- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- JPA/Hibernate
- BCrypt
- Lombok

## API Endpoints

### Authentication
- `POST /register` - Register new user
- `POST /login` - User login (returns JWT token)

### Protected Endpoints
- `GET /students` - Get all students (requires authentication)
- `POST /student` - Add new student (requires authentication)

## Usage

1. Register a new user via `/register`
2. Login via `/login` to get JWT token
3. Include token in Authorization header: `Bearer <token>`
4. Access protected endpoints with valid token

## Setup

1. Clone the repository
2. Configure database connection in `application.properties`
3. Run the application
4. API will be available at `http://localhost:8080`
