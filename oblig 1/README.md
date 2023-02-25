# Run the servers
open the folder in your editor, navigate to the 'Main.java' function, change the singleThread from 'false' to true if you desire multithreading. 

Once the server is started open 'Postman' software select request type 'GET' and url: 'localhost:8080' or your portnumber

### We can see a drastic differnece in speed between multithreaded and singlethreaded server.
singlethreaded took 16 seconds, 
![image](https://user-images.githubusercontent.com/43517080/218351128-327c3d46-660b-4ae4-bf3a-f63170469f9e.png)
multithread took 8, as was set:)
![image](https://user-images.githubusercontent.com/43517080/218351221-5cb0bedf-3d9e-4194-94d4-eb39ebd51237.png)

overall it took twice as much in the singlethreaded vs the multhtreaded server
