# CampusPlus

CampusPlus é um sistema acadêmico desenvolvido com Spring Boot que oferece funcionalidades como mural de avisos, gerenciamento de FAQs e autenticação de usuários. O objetivo do sistema é fornecer uma plataforma centralizada para comunicação e gestão de informações em ambientes educacionais.

## ✨ Funcionalidades

- 🧑‍💼 Registro e autenticação de usuários
- 📢 Mural de avisos
- ❓ FAQs (Perguntas Frequentes)
- 🔒 Controle de permissões por roles (usuário e admin)

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- Maven

## 📁 Estrutura do Projeto

```
campusplus-main/
├── src/main/java/
│   ├── com/example/campusplus/
│   │   └── CampusplusApplication.java
│   ├── controller/             # Controllers REST
│   ├── dto/                    # Objetos de transferência de dados
│   ├── entity/                 # Entidades do banco de dados
│   └── repositories/           # Interfaces JPA para persistência
├── pom.xml                     # Gerenciador de dependências (Maven)
```

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/jhonatan-martinsc/campusplus.git
   ```

2. Importe o projeto em uma IDE Java (como IntelliJ ou Eclipse)

3. Configure o banco de dados (caso necessário, ex: MySQL ou H2)

4. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```

## 🧪 Endpoints Exemplares

- `POST /auth/login` – autenticação
- `GET /mural` – lista de avisos
- `GET /faq` – perguntas frequentes



---

## 📦 Entrega Acadêmica

### ✅ Casos de Uso Envolvidos

A aplicação implementa funcionalidades associadas aos seguintes casos de uso do sistema acadêmico:

- **UC12 – Realizar Login**  
- **UC11 – Gerenciar Usuários**  
- **UC10 – Consultar FAQ**  
- **UC08 – Visualizar Mural**

---

### 🧩 Recorte do Modelo de Classes

![Recorte do Modelo de Classes](https://i.imgur.com/jX3Yb0r.png)

### 📜 Diagramas de Sequência

Os diagramas de sequência estão descritos no documento **"Diagrama de Sequência.docx"**, com destaque para:

- **UC04 – Acessar Conteúdos das Disciplinas**
- **UC07 – Gerenciar Cursos e Disciplinas**

Embora não diretamente implementados, esses exemplos orientaram o estilo arquitetural e a organização das chamadas entre controladores, serviços e entidades no projeto.

---

### 💻 Código-Fonte Comentado

O código-fonte do sistema está organizado segundo a arquitetura MVC com utilização de Spring Boot. Os principais trechos relacionados aos casos de uso estão comentados nas seguintes classes:

- `AuthenticationController` → login e registro (`UC12`, `UC11`)
- `FaqController` → listagem de FAQs (`UC10`)
- `MuralController` → exibição e criação de avisos (`UC08`)
- `User` + `UserRoles` → modelagem do controle de acesso
- `TokenService` e `SecurityFilter` → autenticação e autorização via JWT

