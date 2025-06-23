# 🚀 J2EE-REST

## 📝 Project Overview

**J2EE-REST** is a simple yet practical Java EE project that demonstrates how to build RESTful web services using JAX-RS. The project showcases the creation of REST endpoints for basic operations, including a sample user resource and a root endpoint, making it ideal for learning the fundamentals of REST API development in an enterprise Java environment.

---

## 🗂️ Project Structure

```
J2EE-REST/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── lk.jlat.web.rest/
│   │   │       ├── Home
│   │   │       ├── RESTApplicationPath
│   │   │       ├── User
│   │   │       └── UserResource
│   │   └── resources/
│   └── test/
├── pom.xml
```

---

## 📦 Module Details

#### 🟦 **rest**
  ##
- **Home**  
  Root REST endpoint (`/api/`) responding with a simple "Hello World" message to verify the API is running.

- **RESTApplicationPath**  
  Configures the JAX-RS application path (`/api`) for all REST endpoints.

- **User**  
  Plain Java object (POJO) representing user data with fields for `id`, `name`, and `email`.

- **UserResource**  
  REST resource exposing endpoints under `/api/users`. Supports retrieving a user by ID and returns JSON data.

---

## ⚙️ Key Features

- ✅ RESTful API endpoints with JAX-RS  
- ✅ Simple GET endpoint for root and user resource  
- ✅ JSON response for user data  
- ✅ Clean, modular Java package structure  
- ✅ Maven-based build for easy setup and deployment

---

## 💡 How It Works

- The application is accessible under the `/api` base path.
- The `Home` endpoint responds to `GET /api/` with a plain text greeting.
- The `UserResource` exposes `GET /api/users/{id}` to fetch user details as JSON.
- All endpoints are implemented using standard JAX-RS annotations for clarity and maintainability.

---

## 🛠️ Technologies Used

- Java 11
- Jakarta EE 10 (JAX-RS)
- Maven

---

## 📚 Learning Outcomes

- ✅ Understand the basics of RESTful web service design in Java EE  
- ✅ Learn to implement and expose REST endpoints with JAX-RS  
- ✅ Practice structuring a Java EE project for REST API development  
- ✅ Gain hands-on experience with JSON serialization in Java

---

## 🧑‍💻 Author

Chamika Gayashan  
Undergraduate Software Engineer | Sri Lanka  
Linkedin: @chamikathereal  
Current date: Monday, June 23, 2025, 7:02 PM +0530
