# Oblig 2 operating systems
## Run the program
When the program is run without synchronization, we can see that all the threads are accessing the bookTicket method simultaneously.
This causes multiple threads to be able to book tickets even when the available tickets are less than the number of tickets requested.
We can see this in the logs as we can see some threads returning with a message that tickets are not available even though they were expected to book tickets.
This is incorrect, because it depends on the order in which the threads are executed by the scheduler.

![image](https://user-images.githubusercontent.com/43517080/221362193-fb1fd024-8b05-4ac7-98cd-fbd8a0a53874.png)

As we see here:


The bookTicket method is being accessed by multiple threads simultaneously, without synchronization. we need to use thread synchronization to fix the problem.

## What to change

we need to make bookTicket method synchronized method

this fixes the problem

![image](https://user-images.githubusercontent.com/43517080/221362155-fb62e792-1f47-40c7-b327-69ab08f4f900.png)
