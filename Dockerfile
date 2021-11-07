FROM openjdk:11
COPY ./target/hdfcapp.jar hdfcapp.jar
CMD ["java","-jar","hdfcapp.jar"]