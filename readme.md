# Example Simple "Identity" Service

This is a very very simple identity REST-ish service that has a backend DB.  I'll be adding more to it as I go.

As time went on, this became more of my test-bed service.  A lot of the libraries and integrations work just fine,
but you generally shouldn't take this as a code-style recommendation or "way of doing things".

## Requirements:

NOTE: If you have a version of boot2docker 1.7.1, talk to me, we'll need to get you situated.

1. Use Brew. If you don't use brew, I won't help you
2. [brew install caskroom/cask/brew-cask](https://github.com/caskroom/homebrew-cask)
3. brew cask install virtualbox (Verify you install 5.x)
4. brew install boot2docker
5. Download the java8 jdk. We will be using 8 for all services

When you install boot2docker, make sure you add the following line to your .bash_profile and/or .bashrc
    eval "$(boot2docker shellinit)"

## Setup:

### Create docker postgres image
1. docker pull postgres:latest
2. docker create --name postgres -p 5433:5432 -e POSTGRES_PASSWORD=testbox postgres:latest
3. docker start -a postgres

Why port 5433 for forwarding?
 * Won't conflict with local postgres install
 * Because I could 

### Modify properties
Modify the `application.properties` file to reflect the correct DB host.

### Migrating the database
    ./gradlew flywayMigrate

### Start service
    ./gradlew bootRun

### Start tests in container
    docker-compose run --rm test

### Hit the endpoint
curl -X POST http://yourdockerhost:8080/identity?external_id=123&partner_id=abc

