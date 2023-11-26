FROM openjdk:11
EXPOSE 8091

ADD target/MSFacture-0.0.1-SNAPSHOT.jar MSFacture.jar
ENTRYPOINT ["java","-jar","MSFacture.jar"]