# cinema-app
Implemented application for buying tickets to the cinema, with authentication of users
    and saving the history of their purchases.

- Using technology
    - Spring 5.3.20
    - Spring security 5.6.10
    - Hibernate 5.6.14
    - MySQL connector 8.0.22
    - javax servlet 4.0.1
    - log4j 2.14.1
- the project has a structure  
[cinema](src%2Fmain%2Fjava%2Fcinema) 
  - [config](src%2Fmain%2Fjava%2Fcinema%2Fconfig)
  - [controller](src%2Fmain%2Fjava%2Fcinema%2Fcontroller)
  - [dao](src%2Fmain%2Fjava%2Fcinema%2Fdao)
    - [impl](src%2Fmain%2Fjava%2Fcinema%2Fdao%2Fimpl)
  - [dto](src%2Fmain%2Fjava%2Fcinema%2Fdto)
    - [request](src%2Fmain%2Fjava%2Fcinema%2Fdto%2Frequest)
    - [response](src%2Fmain%2Fjava%2Fcinema%2Fdto%2Fresponse)
  - [exception](src%2Fmain%2Fjava%2Fcinema%2Fexception)  
  - [lib](src%2Fmain%2Fjava%2Fcinema%2Flib)
  - [model](src%2Fmain%2Fjava%2Fcinema%2Fmodel)
  - [security](src%2Fmain%2Fjava%2Fcinema%2Fsecurity)
  - [service](src%2Fmain%2Fjava%2Fcinema%2Fservice)
    - [impl](src%2Fmain%2Fjava%2Fcinema%2Fservice%2Fimpl)
    - [mapper](src%2Fmain%2Fjava%2Fcinema%2Fservice%2Fmapper)
  - [util](src%2Fmain%2Fjava%2Fcinema%2Futil)

- A connection to DB spring_security, which has the following tables, is configured:
  - cinema_halls  
  - movie_sessions  
  - movies  
  - orders  
  - orders_tickets  
  - roles  
  - shopping_carts  
  - shopping_carts_tickets  
  - tickets  
  - users  
  - users_roles  
- Added two roles USER and ADMIN
- Configure DB authentication using roles USER and ADMIN
- the program implements the following access for USER and ADMIN roles
  POST: /register - all  
  GET: /cinema-halls - user/admin  
  POST: /cinema-halls - admin  
  GET: /movies - user/admin  
  POST: /movies - admin  
  GET: /movie-sessions/available - user/admin  
  POST: /movie-sessions - admin  
  PUT: /movie-sessions/{id} - admin  
  DELETE: /movie-sessions/{id} - admin  
  GET: /orders - user  
  POST: /orders/complete - user  
  PUT: /shopping-carts/movie-sessions - user  
  GET: /shopping-carts/by-user - user  
  GET: /users/by-email - admin
- added checks and logs for email validity and password matching.
- Instructions for launching the project
   - fill the file src/main/resources/db.properties with the connection data to the DB, specifying your data.
   - When starting the application, a user is created with the roles ADMIN and USER,
  email "admin@gmail.com" and password "admin"
   - to log data in the src/main/resources/log4j2.xml file, you must specify the full path of the file in the "fileName" field