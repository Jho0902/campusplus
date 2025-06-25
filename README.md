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

## 👨‍💻 Autor

[Jhonatan Martins](https://github.com/jhonatan-martinsc)

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
