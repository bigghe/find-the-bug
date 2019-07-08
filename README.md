
# Find the bugs!

## Getting Started

Clone the repository
 `git clone https://github.com/bigghe/find-the-bug-TMP.git`

or download it from
 `https://github.com/bigghe/find-the-bug/archive/master.zip`

and follow the steps for install/start the project.

Project's stack:
- PostgreSQL as database
- Springboot (Java framework) as backend
- Angular as frontend

### Database
Download PostgreSQL Portable from here:
- https://gareth.flowers/postgresql-portable

then start it.

### Backend
The SpringBoot server application will populate the database schema and will expose rest API.
Import the project inside _server_ folder in Eclipse as _Existing Maven Projects_.
To run the server from the ide be sure to have Java 8 as main jdk and then start it with:

`Debug as -> Java Application `

from _it.academy.test.DemoApplication.java_ class.

Or you can run the server, go into the _server_ folder with a bash console and run:
 
```bash
./mvnw spring-boot:run
```



### Frontend
Import the project inside VSCode with _File -> Open Folder_ and select _client_ directory.
To run the client open a bash console, enter inside project folder and `cd` into _client_ directory and then install all project's dependencies with

```
$ npm install
```
Now you can start Angular with
```
$ npm start
```

The application will run on __localhost:4200__.




