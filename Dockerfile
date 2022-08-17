FROM openjdk:11

ADD target/partner-portal-mapping.jar partner-portal-mapping.jar

ENTRYPOINT ["java","-jar","partner-portal-mapping"]