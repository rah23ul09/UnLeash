From openjdk:8u191-jre-alpine3.8

# Workspace
WORKDIR C:\Users\user\git\repository\amazon_framework

# ADD .jar under target from host 
# into this image
ADD target/Amazon_Framework-0.0.1-SNAPSHOT.jar Amazon_Framework-0.0.1-SNAPSHOT.jar
ADD target/Amazon_Framework-0.0.1-SNAPSHOT-tests.jar Amazon_Framework-0.0.1-SNAPSHOT-tests.jar
ADD target/libs libs

# ADD suite files
ADD testng.xml testng.xml

ENTRYPOINT java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* -DBROWSER=$BROWSER -DHUB_HOST=$HUB_HOST org.testng.TestNG $testng
