FROM java:8
MAINTAINER zhengshangchao zhengshangchao@icloud.com
WORKDIR  /Users/zhengshangchao/workplace/github/spring-demo
ADD ./target/spring-demo-0.0.1-SNAPSHOT.jar ./spring-demo.jar
RUN bash -c 'touch spring-demo.jar'
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "spring-demo.jar"]
