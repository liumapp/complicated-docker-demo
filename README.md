# complicated-docker-demo
A complicated docker demo with Spring Boot Project . 

## how to use

### build a simple docker image and run it .

* cd docker

* docker build -t nginx:my .

* docker run -d -p 92:80 nginx:my

### stop & rm docker container (including image) .

* docker ps . (find the container id , assume is d066ddb91228)

* docker stop d066ddb91228 .  

* docker rm d066ddb91228

* docker rmi nginx:my

### build a maven project 

* cd docker-webc

* mvn clean package

* docker build -t liumapp/docker-webc:v1.0.0 .

* docker run -d -p 8082:8082 liumapp/docker-webc:v1.0.0

### push a project to docker hub

* docker login (maybe you need my account access , but sorry for can not offerd)

* docker push liumapp/docker-webc:v1.0.0

* you can search liumapp/docker-webc on http://hub.docker.com

### create a private repository
 
* first of all , you need have a ecs server(CentOS) & install docker  .

    for how to install and use docker in centos :
    
       yum install docker
        
       systemctl start docker
           
       docker run hello-world
       
* install registry2(named distribution in Github)
 
        docker run -d -p 5000:5000 --restart=always --name registry2 registry:2

* change tag of local image : 

        docker images (find your image , for me , it is liumapp/docker-webc)
        
        docker tag liumapp/docker-webc:v1.0.0 ${your server ip}:5000/liumapp/docker-webc:v1.0.0
        
* config the daemon.js , if you are using mac , you need config it in docker->preferences->daemon . and the info below : 
  
          "insecure-registries" : [
            "${your-server-ip}:5000"
          ],        
        
* push project to private repository : 

        docker push ${your server ip}:5000/liumapp/docker-webc:v1.0.0
        
### use maven plugin to build docker image
        
* add maven-docker-plugin in docker-webc's pom (it should already have). 
        
* cd docker-webc & mvn clean package docker:build
        
### use Docker Compose for single project

* first of all , you need download and install Docker Compose (for more details , plz read : https://docs.docker.com/compose/install/ )

    or you can just run ./docker/install-compose.sh , but you may get the "Operation timed out" exception . 
    
    in this case , you need go to https://github.com/docker/compose/releases and check the latest version of docker-compose.

* use commond :
       
        docker-compose --version
        
  to check is installed .
  
* build docker-webd by docker-compose :
      
      cd docker-webd
      
      docker-compose up

* kill webd :

      docker-compose kill webd

### use Docker Compose for multy project
        
* run install-docker.sh (this shell will build multy images in docker)

* docker-compose up 

    or use docker-compose up -d to run as daemon .
        
* maybe you need restart weba & webb
        
* open your browser , and visit : http://localhost:2333/docker-webb/b or http://localhost:2333/docker-weba/a
        
        
        