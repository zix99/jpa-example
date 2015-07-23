# Example Simple Identity Service

This is a very very simple identity REST-ish service that has a backend DB.  I'll be adding more to it as I go.

## Setup:

### Create docker postgres image
1. docker pull postgres:latest
2. docker create --name postgres -p 5432:5433 postgres:latest POSTGRES_PASSWORD=testbox
3. docker start -a postgres

### Modify properties
Modify the `application.properties` file to reflect the correct DB host.

### Migrating the database
    ./gradlew flywayMigrate

### Start service
    ./gradlew bootRun

### Hit the endpoint
curl -X POST http://yourdockerhost:8080/identity?external_id=123&partner_id=abc

