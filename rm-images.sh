#!/bin/bash

echo '============================================================='
echo '$                                                           $'
echo '$                      liumapp                              $'
echo '$                                                           $'
echo '$                                                           $'
echo '$  email:    liumapp.com@gmail.com                          $'
echo '$  homePage: http://www.liumapp.com                         $'
echo '$  Github:   https://github.com/liumapp                     $'
echo '$                                                           $'
echo '============================================================='
echo '.'


docker rmi liumapp/docker-config:v1.0.0
docker rmi liumapp/docker-gateway:v1.0.0
docker rmi liumapp/docker-weba:v1.0.0
docker rmi liumapp/docker-webb:v1.0.0
docker rmi liumapp/server-maven:v1.0.0:v1.0.0