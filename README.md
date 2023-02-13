# Run the servers
open the folder in your editor, navigate to the 'Main.java' function, change the singleThread from 'false' to true if you desire multithreading. 

Once the server is started open 'Postman' software select request type 'GET' and url: 'localhost:8080' or your portnumber

### We can see a drastic differnece in speed between multithreaded and singlethreaded server
around 8 seconds for multithreaded, around 20 seconds for singlethreaded
