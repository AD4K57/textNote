FROM openjdk:17
COPY ./target/*.jar /mao/textNote.jar
EXPOSE 8080
ENTRYPOINT java -jar /mao/textNote.jar