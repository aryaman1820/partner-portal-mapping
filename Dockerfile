FROM openjdk:11

ADD target/partner-portal-mapping.jar partner-portal-mapping.jar

EXPOSE 8087

ENTRYPOINT ["java","-jar","partner-portal-mapping"]