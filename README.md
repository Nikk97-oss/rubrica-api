# Rubrica API

API REST sviluppata con **Spring Boot** per la gestione di una rubrica contatti.  
Il progetto implementa un **CRUD completo** (Create, Read, Update, Delete) utilizzando **Spring Data JPA** e **Hibernate**.

---

## Tecnologie utilizzate

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- Database relazionale (MySQL / H2 / altro configurabile)
- IntelliJ IDEA

---

## Struttura del progetto

src
├── main
│ ├── java
│ │ └── dev.zanda.rubrica
│ │ ├── controllers
│ │ │ └── ContactController.java
│ │ ├── models
│ │ │ └── Contatto.java
│ │ ├── repositories
│ │ │ └── ContactRepository.java
│ │ ├── services
│ │ │ └── ContactService.java
│ │ └── RubricaApiApplication.java
│ └── resources
│ └── application.properties
└── test
└── java
└── dev.zanda.rubrica
└── RubricaApiApplicationTests.java

---

## Modello dati

**Contatto**
- `contact_id` (ID, auto-generato)
- `nome`
- `cognome`
- `email`
- `nTel`

---


### Recupero contatti

- **GET** `/api/rubrica`  
  Restituisce tutti i contatti

- **GET** `/api/rubrica/firstName/{nome}`  
  Restituisce i contatti filtrati per nome

- **GET** `/api/rubrica/lastName/{cognome}`  
  Restituisce i contatti filtrati per cognome

---

### Creazione contatto

- **POST** `/api/rubrica`

```json
{
  "nome": "Nicola",
  "cognome": "Cirelli",
  "email": "nicola@email.it",
  "nTel": "3341019701"
}

```

### Aggiornamento contatto
- **PUT** `/api/rubrica/{id}`

```json

{
  "nome": "Nicola",
  "cognome": "Cirelli",
  "email": "nicola.aggiornato@email.it",
  "nTel": "3330000000"
}

```

### Eliminazione contatto
- **DELETE** `/api/rubrica/{id}`
Restituisce:

200 OK se eliminato

400 Bad Request se l’ID non esiste


### Avvio del progetto
Clonare il repository

Configurare il database in application.properties

Avviare l’applicazione

mvn spring-boot:run
L’API sarà disponibile su:

http://localhost:8080/api/rubrica


### Stato del progetto
CRUD completo funzionante

Testato tramite API simulator di IntelliJ

Struttura Service / Repository / Controller rispettata

---AGGIORNAMENTO ESEGUITO---

## Error Handling

L'applicazione gestisce errori di validazione e risorse non trovate restituendo
risposte HTTP coerenti (400, 404) con messaggi strutturati.

## Testing

Gli endpoint sono stati testati manualmente tramite IntelliJ HTTP Client.

### Autore
Nicola Cirelli

Progetto didattico sviluppato per studio di Spring Boot e REST API.


