FROM jenkins/jenkins:alpine-jdk11
VOLUME /var/jenkins_home
EXPOSE 7000
USER root
RUN apk update && apk add --no-cache git gradle