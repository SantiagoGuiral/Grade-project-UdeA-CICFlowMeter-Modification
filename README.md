# Grade Proejct UdeA - CICFlowMeter Study and Modification

## Introduction

"CICFlowmeter-V4.0 (formerly known as ISCXFlowMeter) is an Ethernet traffic Bi-flow generator and analyzer for anomaly detection that has been used in many Cybersecurity datsets." 

<a href="https://github.com/ahlashkari/CICFlowMeter" target="_blank">CICFlowMeter V4.0 Github<a/>

This repository presents a modifcation of CICFlowMeter made by Santiago Rios Guiral for the grade project at the University of Antioquia.
  
Citation: S. Ríos Guiral, “Desarrollo de extractor de características de tráfico de redes orientado a la identificación y análisis en la detección de ataques”, Trabajo de grado profesional, ingeniería electrónica, Universidad de Antioquia, Medellín, Antioquia, Colombia, 2022. <a href="http://bibliotecadigital.udea.edu.co/handle/10495/26164" target="_blank">Grade project report<a/>.

For the elaboration of the grade project, the CICFlowMeter extractor was modified by including a total of 29 traffic characteristics that allosws to obtain more information of the network traffic and sets a more robuts system.
  
  
## Install jnetpcap local repo

for linux, sudo is a prerequisite
```
//linux :at the pathtoproject/jnetpcap/linux/jnetpcap-1.4.r1425
//windows: at the pathtoproject/jnetpcap/win/jnetpcap-1.4.r1425
mvn install:install-file -Dfile=jnetpcap.jar -DgroupId=org.jnetpcap -DartifactId=jnetpcap -Dversion=1.4.1 -Dpackaging=jar
```

## Make package

### IntelliJ IDEA
open a Terminal in the IDE
```
//linux:
$ ./gradlew distZip
//window
$ gradlew distZip
```
the zip file will be in the pathtoproject/CICFlowMeter/build/distributions

### Eclipse
At the project root
```
mvn package
```
the jar file will be in the pathtoproject/CICFlowMeter/target

  
## Run
### IntelliJ IDEA
open a Terminal in the IDE
```
//linux:
$ sudo bash
$ ./gradlew execute

//windows:
$ gradlew execute
```
### Eclipse

Run eclipse with sudo
```
1. Right click App.java -> Run As -> Run Configurations -> Arguments -> VM arguments:
-Djava.library.path="pathtoproject/jnetpcap/linux/jnetpcap-1.4.r1425"  -> Run

2. Right click App.java -> Run As -> Java Application

```
