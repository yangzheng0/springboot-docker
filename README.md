# springboot-docker

springboot 整合 maven 构建 docker容器 demo

1. mvn clean package docker:build -X -Dmaven.test.skip=true
2. docker run -d -p 18080:8080 yangzheng123/springboot-docker


-X -DpushImage  推送到容器仓库
