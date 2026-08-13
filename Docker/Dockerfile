FROM eclipse-temurin:17-jdk

MAINTAINER usrdocker

USER root

COPY target/java-algorithms-api-0.0.1.jar /opt/algorithms-api-0.0.1.jar

WORKDIR /opt

EXPOSE 8089

ENTRYPOINT ["java", "-Xms128m", "-Xmx256m", "-Xss256k", "-XX:+UseSerialGC", "-XX:+UseContainerSupport", "-XX:MaxRAMPercentage=65.0", "-XX:InitialRAMPercentage=30", "-jar", "algorithms-api-0.0.1.jar"]