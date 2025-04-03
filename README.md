# 🌀 Rick and Morty API Client  

## 🚀 Sobre o Projeto  
Este projeto é uma aplicação Spring Boot que consome a **API pública do Rick and Morty**. Ele fornece endpoints para buscar informações sobre **personagens, episódios e localizações** da série, utilizando o **Spring Web (RestTemplate)** para realizar as requisições HTTP.  

🔗 **Documentação da API utilizada:** [Rick and Morty API](https://rickandmortyapi.com/documentation)  

## 🛠️ Tecnologias Utilizadas  
- **Java 21**  
- **Spring Boot 3.4.4**  
- **Spring Web** (para consumo da API externa)  
- **Lombok** (para redução de código repetitivo)  
- **Maven** (gerenciamento de dependências)  

## 📌 Funcionalidades Implementadas  
✅ **Buscar personagem pelo ID**  
✅ **Listar todos os episódios**  
✅ **Buscar localização pelo ID**  

---

## 📦 Estrutura do Projeto  

```sh
📂 src/main/java/projeto/api_rick_and_morty
 ├── 📂 client        # Classe que faz a requisição à API externa
 │   ├── RickAndMortyClient.java
 │   
 ├── 📂 controller    # Exposição dos endpoints REST
 │   ├── RickAndMortyController.java
 │   
 ├── 📂 model         # Modelos de resposta para os dados da API
 │   ├── CharacterResponse.java
 │   ├── EpisodeResponse.java
 │   ├── ListOfEpisodesResponse.java
 │   ├── LocationResponse.java
 │   
 ├── 📜 ApiRickAndMortyApplication.java  # Classe principal da aplicação
```

---

## 🔧 Como Executar o Projeto  

### 🖥️ Pré-requisitos  
Antes de iniciar, você precisará ter as seguintes ferramentas instaladas na sua máquina:  
- **JDK 21**  
- **Maven**  

### 🏃 Passos para rodar a aplicação  

1️⃣ **Clone o repositório**  
```sh
git clone https://github.com/seu-usuario/api-rick-and-morty.git
```

2️⃣ **Acesse o diretório do projeto**  
```sh
cd api-rick-and-morty
```

3️⃣ **Execute o projeto com Maven**  
```sh
mvn spring-boot:run
```

A aplicação estará rodando em **http://localhost:8080** 🎉  

---

## 📢 Como Usar a API  

### 🔍 Buscar um personagem por ID  
- **Rota:** `GET /api/rick-and-morty/character/{id}`  
- **Exemplo:** `GET /api/rick-and-morty/character/1`  
- **Resposta:**  
```json
{
  "id": "1",
  "name": "Rick Sanchez",
  "status": "Alive",
  "species": "Human",
  "image": "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
  "episode": ["https://rickandmortyapi.com/api/episode/1"]
}
```

### 🎞️ Listar todos os episódios  
- **Rota:** `GET /api/rick-and-morty/episode`  
- **Resposta:**  
```json
{
  "results": [
    {
      "id": "1",
      "name": "Pilot",
      "air_date": "December 2, 2013",
      "episode": "S01E01",
      "characters": ["https://rickandmortyapi.com/api/character/1"]
    }
  ]
}
```

### 🌍 Buscar uma localização por ID  
- **Rota:** `GET /api/rick-and-morty/location/{id}`  
- **Exemplo:** `GET /api/rick-and-morty/location/3`  
- **Resposta:**  
```json
{
  "id": 3,
  "name": "Citadel of Ricks",
  "type": "Space station",
  "dimension": "unknown",
  "residents": ["https://rickandmortyapi.com/api/character/4"]
}
```

---

## 🛠 Testando a API com Postman  

Como esta aplicação consome uma **API externa**, o **Postman** foi utilizado para testar as requisições.  

### Passos para testar no Postman:  
1️⃣ Abra o **Postman**  
2️⃣ Crie uma nova **requisição HTTP**  
3️⃣ Escolha o método **GET** e insira a URL, por exemplo:  
   ```
   http://localhost:8080/api/rick-and-morty/character/1
   ```
4️⃣ Clique em **Send** para visualizar a resposta da API  

💡 **Dica:** Você pode salvar as requisições no Postman para reutilizar depois!  

---

## 🛠 Melhorias Futuras  

- 🔹 Implementar cache para otimizar chamadas à API  
- 🔹 Criar integração com banco de dados para persistência dos dados  

---

## 🤝 Contribuindo  

Contribuições são bem-vindas! Siga os passos abaixo:  
1. Faça um **fork** deste repositório  
2. Crie uma nova **branch** (`git checkout -b minha-feature`)  
3. Faça as alterações e **commite** (`git commit -m 'Minha nova feature'`)  
4. Faça o **push** para a sua branch (`git push origin minha-feature`)  
5. Abra um **Pull Request** 🚀  

---


📌 **Desenvolvido por [@paolahegel](https://github.com/paolahegel)**  
  
