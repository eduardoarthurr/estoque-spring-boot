
---

# 🛒 Sistema de Gerenciamento de Estoque - Spring Boot 🍃

Este projeto é uma aplicação **backend** desenvolvida com **Spring Boot**, criada para treinar e praticar o desenvolvimento de APIs RESTful.
O objetivo principal é construir um sistema que permite o controle dos produtos através das operações básicas de CRUD.

---

## 🚀 Objetivo do Projeto

Criar uma API que permita o **cadastro, leitura, atualização e exclusão de produtos** em um sistema de estoque.
Essa aplicação servirá como base para o consumo por uma aplicação **frontend**, que poderá ser usada pelos usuários para gerenciar os produtos de forma simples e eficiente.

---

## ⚙️ Funcionalidades (CRUD)

* **Create (Criar):** Adicionar novos produtos ao sistema.
* **Read (Ler):** Recuperar e listar informações dos produtos cadastrados.
* **Update (Atualizar):** Editar detalhes de produtos existentes (ex: nome, preço, quantidade).
* **Delete (Excluir):** Remover produtos que não são mais necessários no estoque.

---

## 🧩 Estrutura do Projeto

```
src/
 ├── main/
 │    ├── java/
 │    │    └── com/exemplo/estoque
 │    │         ├── controller/   # Controladores da API (endpoints)
 │    │         ├── model/        # Classes de modelo (entidades)
 │    │         ├── repository/   # Interfaces de acesso ao banco de dados
 │    │         └── service/      # Lógica de negócio
 │    └── resources/
 │         ├── application.properties  # Configurações da aplicação
 │       
 └── test/
      └── ...                         # Testes 
```

---

## 🛠️ Tecnologias Utilizadas

* **Java 21**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **SQL Developer** 
* **Maven** 

---

## 🧪 Como Executar o Projeto

1. **Clonar o repositório**

   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```

2. **Acessar o diretório do projeto**

   ```bash
   cd nome-do-repositorio
   ```

3. **Executar a aplicação**

   ```bash
   ./mvnw spring-boot:run
   ```

   ou, se estiver usando o Maven instalado:

   ```bash
   mvn spring-boot:run
   ```

4. **Acessar no navegador**

   ```
   http://localhost:8080/api/produtos
   ```

---

## 📄 Licença

Este projeto foi desenvolvido apenas para fins **educacionais e de prática**.
Sinta-se à vontade para clonar, estudar e modificar conforme desejar.

---
