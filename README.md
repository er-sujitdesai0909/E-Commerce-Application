# E-Commerce Backend API

A RESTful E-Commerce backend application built using **Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL**. The application provides APIs for product management, keyword-based search, and product image upload and retrieval.

## 🚀 Features

- **Product Management:** Create, retrieve, update, and delete products using REST APIs.
- **Product Search:** Search products using keywords across relevant product fields.
- **Image Upload:** Upload product images using multipart file requests.
- **Image Retrieval:** Retrieve stored product images through dedicated API endpoints.
- **Database Integration:** Persist product information using Spring Data JPA and Hibernate.
- **RESTful API Design:** Handle HTTP requests and JSON responses.
- **Exception Handling:** Handle invalid requests and API errors.
- **Layered Architecture:** Separate controllers, services, repositories, and entities for maintainability.

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Java | Backend programming language |
| Spring Boot | Application development |
| Spring Web | REST API development |
| Spring Data JPA | Database access |
| Hibernate | ORM and entity persistence |
| MySQL | Relational database |
| Maven | Dependency and build management |
| Postman | API testing |

## 🏗️ Architecture

The application follows a layered backend architecture:

```text
Client / Postman
       |
       v
 REST Controllers
       |
       v
  Service Layer
       |
       v
Repository Layer
       |
       v
 MySQL Database
```

- **Controller Layer:** Exposes REST endpoints and handles incoming requests.
- **Service Layer:** Contains business logic and coordinates operations.
- **Repository Layer:** Performs database operations using Spring Data JPA.
- **Entity Layer:** Defines the product model and database mapping.
- **Configuration:** Manages application settings and database connectivity.

## 📦 Product Model

The product entity contains the following fields:

| Field | Description |
|---|---|
| `id` | Unique product identifier |
| `name` | Product name |
| `description` | Product description |
| `brand` | Product brand |
| `category` | Product category |
| `price` | Product price |
| `releaseDate` | Product release date |
| `productAvailable` | Product availability status |
| `stockQuantity` | Available stock quantity |
| `imageName` | Product image filename |
| `imageType` | Product image content type |
| `imageData` | Product image data, if stored in the entity |

*The image-related fields should be adjusted to match your actual entity implementation.*

## 🔗 API Endpoints

The backend provides the following API functionality. Refer to the controller mappings for the exact paths and HTTP methods.

| Operation | Description |
|---|---|
| Create Product | Add a new product |
| Get All Products | Retrieve product listings |
| Get Product by ID | Retrieve a specific product |
| Update Product | Update product information and image |
| Delete Product | Remove a product |
| Search Products | Find products using keywords |
| Get Product Image | Retrieve an individual product image |

### Example Product JSON

```json
{
  "name": "Galaxy S24",
  "description": "Samsung smartphone",
  "brand": "Samsung",
  "category": "Smartphone",
  "price": 74999.00,
  "releaseDate": "2024-01-30",
  "productAvailable": true,
  "stockQuantity": 25
}
```

Use the actual field names and date format expected by your application.

## ⚙️ Prerequisites

- Java JDK compatible with the project
- Maven
- MySQL Server
- Postman or another REST API client

## 🗄️ Database Configuration

Configure the database connection in:

`src/main/resources/application.properties`

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Set `DB_USERNAME` and `DB_PASSWORD` in your environment before starting the application. Ensure the database exists and the MySQL server is running.

Use a suitable schema-management strategy for production rather than relying on automatic schema updates.

## ▶️ Build and Run the Backend

Clone the repository:

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

Navigate to the project directory:

```bash
cd YOUR_PROJECT_DIRECTORY
```

Build the application:

```bash
mvn clean package
```

Start the Spring Boot application:

```bash
mvn spring-boot:run
```

The default application URL is:

`http://localhost:8080`

The actual port depends on your application configuration.

## 🧪 API Testing

Use Postman to test the backend endpoints.

- Send JSON requests to product creation and retrieval endpoints.
- Test product updates using the request format expected by the controller.
- Use `multipart/form-data` for product image uploads when required.
- Test keyword searches with different product names, brands, and categories.
- Verify responses for invalid product IDs and malformed requests.

## 💡 Key Learning Outcomes

- Developing REST APIs using Spring Boot.
- Implementing CRUD operations.
- Integrating MySQL using Spring Data JPA and Hibernate.
- Mapping Java entities to relational database tables.
- Handling multipart file uploads.
- Implementing keyword-based search queries.
- Structuring maintainable backend applications using layered architecture.

## 🔮 Potential Enhancements

- Authentication and role-based authorization.
- Pagination and sorting.
- Advanced filtering by category, brand, and price.
- Input validation and centralized exception handling.
- Automated unit and integration tests.
- API documentation using OpenAPI/Swagger.

## 👨‍💻 Author

**Sujit Desai**

GitHub: [er-sujitdesai0909](https://github.com/er-sujitdesai0909)

