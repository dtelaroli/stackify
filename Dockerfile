FROM spring

COPY target/stackify.jar app.jar

CMD java -DSTACKIFY_APPLICATION_NAME=Stackify -DSTACKIFY_DOCKER_ENABLED=true -javaagent:/usr/local/stackify/stackify-java-apm/stackify-java-apm.jar -jar app.jar
