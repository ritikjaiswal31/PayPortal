# PayPortal 💳 (Digital Payment Platform using Microservices)

PayPortal is a scalable fintech backend application built using **Java**, **Spring Boot**, and **Distributed Microservices Architecture**.  
The system integrates **API Gateway**, **JWT-based authentication**, **Kafka** for event-driven communication, **Redis** for caching and session management and **Docker** for containerized deployment—ensuring high performance, security, and scalability across all services.

---

## Features

- 🔐 **User Authentication & Authorization** – Secure login and registration with JWT and role-based access control  
- 💼 **Wallet Management** – Create, manage, and track digital wallets with balance updates  
- 💸 **Transaction Processing** – Real-time fund transfers powered by Kafka-based event-driven architecture  
- 🎁 **Reward System** – Automated reward assignment after successful transactions  
- 📩 **Notification Service** – Real-time alerts for payments, wallet updates, and rewards  
- 🌐 **API Gateway Integration** – Centralized routing and authentication using Spring Cloud Gateway and Redis  
- 🐳 **Containerized Deployment** – Seamless setup and deployment with Docker  

---

## Core Technologies

✅ API Gateway (Spring Cloud Gateway)  
✅ JWT Authentication & Authorization  
✅ Kafka (Event-driven Communication)  
✅ Redis (Rate Limiting / Caching)  
✅ Docker (Containerization)  
✅ Microservices Architecture  

---

## Architecture Overview

PayPortal follows a **microservices architecture** that promotes scalability, resilience, and modularity.  
Each service operates independently and communicates asynchronously through **Kafka events**.

---

## Tech Stack

| Category | Technologies |
|-----------|--------------|
| **Language** | Java |
| **Framework** | Spring Boot |
| **Architecture** | Microservices |
| **Event Broker** | Apache Kafka |
| **Authentication** | JWT + Spring Security |
| **Database** | H2 / PostgreSQL |
| **Cache** | Redis |
| **Gateway** | Spring Cloud Gateway |
| **Documentation & Monitoring** | Swagger, Spring Boot Admin |
| **Containerization** | Docker |

---

## Microservices Breakdown

| Service | Key Dependencies |
|----------|------------------|
| **user-service** | Spring Boot Web + Security + JPA + JWT + H2 |
| **transaction-service** | Web + Security + JPA + Kafka + JWT + Validation + H2 |
| **notification-service** | Web + JPA + Kafka + H2 |
| **reward-service** | Web + JPA + Kafka + H2 |
| **wallet-service** | Web + JPA + Validation + PostgreSQL + Spring Boot Admin + Swagger + Netty |
| **api-gateway** | WebFlux + Spring Cloud Gateway + Security + JWT + Redis |
| **root (payportal-clone)** | Module aggregator + dependency management |

---

## Workflow

1. **User Registration/Login** → via `user-service` (JWT authentication)  
2. **Wallet Creation** → `wallet-service` assigns a wallet to each user  
3. **Transaction Initiation** → processed by `transaction-service` and published to **Kafka**  
4. **Event Consumption** → `reward-service` and `notification-service` respond to transaction events  
5. **API Gateway** → routes and secures all requests using JWT and Redis  
6. **Deployment** → Docker containers orchestrate and manage all services  

---

## Tools & Integrations

- **Apache Kafka** → Enables asynchronous, event-driven communication  
- **Redis** → Handles caching and distributed session storage  
- **Swagger** → Interactive API documentation for all microservices  
- **Spring Boot Admin** → Monitors and manages running services  
- **Docker** → Simplifies multi-service deployment  

---

## Screenshots

<img width="1140" height="612" alt="Screenshot 2025-10-30 003241" src="https://github.com/user-attachments/assets/688f97aa-c558-44b0-8db3-8e7aacf556d2" />

<img width="1518" height="314" alt="Screenshot 2025-10-30 003513" src="https://github.com/user-attachments/assets/36ce5fdd-c92e-4b48-8f0e-27d2848d5964" />

<img width="814" height="497" alt="Screenshot 2025-10-30 003817" src="https://github.com/user-attachments/assets/0ec92b01-da74-49a8-9144-6a944df9227f" />

<img width="1579" height="495" alt="Screenshot 2025-10-30 003547" src="https://github.com/user-attachments/assets/400deffd-0cd2-4a29-9c52-9e673fb1bb9c" />

<img width="1584" height="499" alt="Screenshot 2025-10-30 003620" src="https://github.com/user-attachments/assets/200d2f40-2953-44a0-aeab-91ffd7e96818" />



