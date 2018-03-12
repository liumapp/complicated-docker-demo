# server-profile

## how to use

* mvn clean package

* plz make sure you already config hosts correctly :

        127.0.0.1 peer1 peer2

* use orders : 

        java -jar server-profile-v1.0.0.jar --spring.profiles.active=peer1
        
        java -jar server-profile-v1.0.0.jar --spring.profiles.active=peer2
        
* the result shall be like : 
        
    ![server-profile.jpg](https://github.com/liumapp/complicated-docker-demo/blob/master/pic/server-profile.jpg)         