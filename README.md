# complicated-docker-demo
A complicated docker demo with Spring Boot Project .
 
## Prerequisites
 
### Docker Swarm
 
A swarm is made up of multiple nodes, which can be either physical or virtual machines. 

The basic concept is simple enough: run docker swarm init to enable swarm mode and make your current machine a swarm manager
 
then run docker swarm join on other machines to have them join the swarm as workers.

### Stack 

A stack is a group of interrelated services that share dependencies

and can be orchestrated and scaled together

A single stack is capable of defining and coordinating the functionality of an entire application 

though very complex applications may want to use multiple stacks
 
## how to use

### make multy Eureka Server

* first of all let's build a 2 hosts eureka server , so , you need to config your hosts file first : 

    ![hosts_mac.jpg](https://github.com/liumapp/complicated-docker-demo/blob/master/pic/hosts_mac.jpg)

    you can name your local host as your wish . (in Mac , the hosts file path is /etc/hosts)
     
    for me , i named it as peer1 & peer2
     
* start docker-multy-eureka . 

     there are two modules in docker-multy-eureka . 
     
     server-maven is build by docker-maven-plugin . 
     
     server-profile is build by simple orders .
      
     for more details , plz read readme in server-profile
      
### make multy Spring Cloud MicroServices . 
      
* we will use server-maven of docker-multy-eureka as eureka server .
      
* run install-docker.sh to build docker image .
      
* run "docker-compose up -d" to start 6 module .

* use commonds below to make 3 module instance : 
      
      docker-compose scale weba=3 webb=3 config=3 
      
    but this still remain problem to be solve .       
     
     
    
















