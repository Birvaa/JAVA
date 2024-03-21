#include<stdio.h>
void main (){
    int i,j;
    printf("enter number : ");
    scanf("%d",&i);
    printf("enter number : ");
    scanf("%d",&j);
   i=i+j;
   j=i-j;
   i=i-j;
   printf("now i=%d and j=%d ",i,j);
}
    