# Stackify Configuration

Application for tests with Stackify Retrace.

## Endpoins

```
/logback
/stackify
/java
```

## Configuration

You should configure your apiKey on files:
- src/main/resources/logback.xml

## Using

### Java

```
mvn clean package
mvn spring-boot:run
```

### Docker

```
mvn clean package
docker build -t stackify .
docker run --rm -it -p 8080:8080 -v /usr/local/stackify:/usr/local/stackify stackify
```

### Compose

```
mvn clean package
docker-compose up --build
```
