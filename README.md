Welcome to RESTful API

Created by: Abubakar Qasim 

Referenced from : https://spring.io/guides/gs/rest-service/#scratch

Today's Date: June 9th, 2022

All .java files are located in src\main\java\com\example\demo
   This is where all the .java files which have java code are located. Since this is my first API, I can reference this sheet to better understand what
   is occuring within the files.

   This project was also built using Gradle.

The DemoApplication.java is the main java class. Within it, I created a simple scanner method to ensure the .main is running. That is the main class. 

Then there is Greeting.java and GreetingController.java which is self exlplanatory. The Greeting.java is used to indicate the beginning of the API class. Whilst
the GreetingController.java is used to help arguments pass by. Further research will have to be done to better understand that.

Now in order to run the build, we can do one of two things. 

    ./gradlew bootRun 
   
   which will compile and run the file on its own 

   OR 

    ./gradlew build 
   
   which will compile the files 
   then we will use 

    java -jar .\build\libs\demo-0.0.1-SNAPSHOT.jar

   which will then run the file. 
   
 Now to visit the API, http://localhost:8080/greeting which will display the given 'Hello, World'
 
 Reason being it is the default. Therefore, it will output 'Hello, World!'
 
 Yet, when we visit http://localhost:8080/greeting?name=User, it will display 'Hello, User!' instead and will update the id number from 1 to 2.
 Now it will also change 'Hello, World!' to 'Hello, User!' becuase of the 'name=User' part of the link. If name='anythingelse' it will change it to that and greet them. 


Mubarak on your new API! 
