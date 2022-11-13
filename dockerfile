FROM openjdk:11-jdk
EXPOSE 8080
ADD /build/libs/reql-estate-transaction-price-api-1.0.0.jar .
ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=local", "reql-estate-transaction-price-api-1.0.0.jar"]
