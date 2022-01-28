FROM gradle:7-jdk11-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon


FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8765
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/react-workshop-be.jar
ENTRYPOINT ["java","-jar","/app/react-workshop-be.jar"]
