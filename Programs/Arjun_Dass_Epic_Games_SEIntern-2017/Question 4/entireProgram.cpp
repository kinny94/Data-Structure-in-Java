#include <stdio.h>
#include<iostream>
#include<string>

int turn(int r, int c, int h, int w){
    int equal = 1;
    if(r > h-1-r){
      r = h-1-r, equal = 0;
    }
    if(c >= w-1-c) c = w-1-c, equal = 0; 
    r -= equal; 
    if(r==c) return 1;
    return 0;
}

int directions[4][2] = {{0,1},{1,0},{0,-1},{-1,0}};
void BuildStringFromMatrix(int *a, int height, int width, char* OutputBuffer = '\0'){
    int b[height][width];
    for(int i=0; i<height; i++){
      for(int j=0; j<width; j++){
        int x = a[i*width + j];
        b[i][j] = x;
      }
    }
  
    std::string store = "";   
    std::cout<<store;
    int idX=0, i=0;
    int currentRow=0, currentCol=0;
    for(i=0; i<height*width; i++){
        std::string s = std::to_string(b[currentRow][currentCol]);
        store.append(s+", ");
        if(turn(currentRow, currentCol, height, width)){
            idX = (idX+1)%4;
        }
        currentRow += directions[idX][0];
        currentCol += directions[idX][1];
    }
    
    std::cout<<store;
    printf("\n");
}

int main(){
    int arr[3][4]= {{2,3,4,8},{5,7,9,12},{1, 0, 6, 10}};
    char array[20];
    //int *a = &arr[0][0];
    BuildStringFromMatrix((int *)arr, 3, 4, array);
}