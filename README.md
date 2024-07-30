# Spring Boot MySQL Authentication CI/CD

This project showcases a CI/CD pipeline designed to automate the full lifecycle of a Spring Boot application integrated with MySQL. The pipeline efficiently handles build, test, deployment, and Kubernetes manifest updates using modern DevOps tools and practices.

## Authentication Showcase
Watch the video below to see how the authentication process works in the Spring Boot application integrated with MySQL.

https://github.com/user-attachments/assets/cb2f6147-7b04-47d4-b7fa-db16e2c0873d


## Pipeline Overview
The pipeline automates various stages to facilitate continuous integration and delivery:

### Build
- **Compile:** 
   Compiles the Java project using Maven to prepare the code for the next stages.
   
- **Package:** Packages the application into a JAR file, making it ready for distribution and deployment.

### Test
- **Unit Test:** 
   Executes unit tests to verify functionality and maintain code quality, ensuring the application behaves as expected.

- **SonarQube Analysis:** 
   Performs static code analysis to identify bugs, vulnerabilities, and code smells, ensuring code quality and security.

### Deploy
- **Nexus Artifact:** 
   Uploads build artifacts, including JAR files, POM files, and other Maven dependencies, to Nexus Repository for version control and distribution.

- **Docker Deployment:** 
   Builds a Docker image of the application and pushes it to Docker Hub, ensuring the application is containerized and ready for deployment.

- **Kubernetes Deployment:** 
   Utilizing Argo CD to automate the deployment of updated Kubernetes manifests, ensuring seamless and reliable delivery of the application into the Kubernetes cluster, with efficient management of deployment and configuration updates.

## Tools and Technologies Used
- **Argo CD**: GitOps continuous delivery tool for Kubernetes.
- **Kubernetes**: Container orchestration platform for managing containerized applications.
- **SonarQube**: Code quality and security analysis tool.
- **Nexus Repository Manager**: Artifact repository for managing dependencies.
- **Maven**: Build automation tool for Java projects.
- **DockerHub**: Registry service for Docker containers.
- **Private GitLab Runner**: CI/CD job runner for GitLab.

## Visuals

### Argo CD
<img src="https://gitlab.com/razielsa/springboot-mysql-ci-cd-pipeline/-/wikis/uploads/07bfc5ce14b3696d3d1ad609c2ed62ef/argo.jpg" alt="Argo CD" width="600">

### SonarQube
<img src="https://gitlab.com/razielsa/springboot-mysql-ci-cd-pipeline/-/wikis/uploads/f73aec93967d86cf95afcf802f94defa/sonar2.jpg" alt="SonarQube" width="600">
<img src="https://gitlab.com/razielsa/springboot-mysql-ci-cd-pipeline/-/wikis/uploads/c6879b07b4909f0d95bfa31040b8d808/sonar1.jpg" alt="SonarQube" width="600">

### Nexus Repository
<img src="https://gitlab.com/razielsa/springboot-mysql-ci-cd-pipeline/-/wikis/uploads/bd6ec3fc77a53d4f5c961d3150b4b46a/nexus.jpg" alt="Nexus Repository Manager" width="600">

### Sprint Boot MySQL Application
<img src="https://gitlab.com/razielsa/springboot-mysql-ci-cd-pipeline/-/wikis/uploads/01a10011d79e15037bcc6d9aef8f72bc/mysqlapp.jpg" alt="Spring Boot Application" width="600">
