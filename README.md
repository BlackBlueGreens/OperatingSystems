# Run the servers
open the folder in your editor, navigate to the 'Main.java' function, change the singleThread from 'false' to true if you desire multithreading. 

Once the server is started open 'Postman' software select request type 'GET' and url: 'localhost:8080' or your portnumber

### We can see a drastic differnece in speed between multithreaded and singlethreaded server
The single threaded took 2minutes and 40 seconds to generate a response :(
![image](https://user-images.githubusercontent.com/43517080/218350361-787a04bf-f916-4ff5-810d-4dd0bb6dc519.png)

