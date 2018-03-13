# complicated-docker-demo
A complicated docker demo with Spring Boot Project . 

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
      
*       
     
     
    
















