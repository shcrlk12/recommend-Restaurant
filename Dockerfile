#FROM nginx
#
#COPY default.conf /etc/nginx/conf.d/default.conf
#
#CMD ["nginx", "-g", "daemon off;"]

FROM tomcat:9-jre8-alpine

# war 파일 복사
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war

ENV JAVA_OPTS="-DsvrNo=4"
ENV TZ=Asia/Seoul
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN rm -r /usr/local/tomcat/webapps/ROOT
