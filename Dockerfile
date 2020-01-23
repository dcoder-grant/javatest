FROM registry.redhat.io/redhat-openjdk-18/openjdk18-openshift

ENV JAVA_APP_JAR=testingwar.war\
    ARTIFACT_COPY_ARGS='*.war'

ADD testingwar.war /deployments/testingwar.war

EXPOSE 8080
