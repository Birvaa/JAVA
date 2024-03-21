#include<stdio.h>
void main(){
     int a,count=0,i=1;
     printf("enter number :");
     scanf("%d",&a);
     for(i=1;i<=a;i++)
     { 
        if(a%i==0){
            count++;
           
        } 
       
     }
    if(count==2){
        printf("number is prime");
    }
    else{
        printf("not a prime");
    }
     
     
}
