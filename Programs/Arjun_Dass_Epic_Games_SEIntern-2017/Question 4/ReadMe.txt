Implementation
Inorder to run the program you might have to include some libraries like iostream.h, string.h.. Please refer to the sample( entireProgram.cpp ) program in case if there is an issue.

I have implemented this program by splitting the outermost loop matrix into two parts - the top right part and the botton left part.
First part :-
1 2 3 4 
       8
5 6 7  2
9 0 1  6   
3 4 5  1 
7 8 9

2nd Part:-
   6 7
5  0 1   
9  4 5
3 
7 8 9 

and continuing till the end.

* This program took approximately 7hrs for me (including intervals) because frankly I have been working with a lot of python and java at this time, I had to take some time to get over pointers and understand conversion syntax. But finally I managed to get the perfect output.