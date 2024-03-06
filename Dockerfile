FROM openjdk:17


RUN mkdir /Project


COPY bin/ /Project


CMD java com.cisco.petsclinic.PetsClinic
