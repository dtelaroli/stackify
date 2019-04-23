FROM spring

COPY target/stackify.jar app.jar

CMD java -jar -DSTACKIFY_APPLICATION_NAME=Stackify -DSTACKIFY_DOCKER_ENABLED=true -javaagent:/usr/local/stackify/stackify-java-apm/stackify-java-apm.jar app.jar 
