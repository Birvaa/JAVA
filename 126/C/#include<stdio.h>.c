#include<stdio.h>
void main(){
    int a;
    printf("enter a number");
    scanf("%d",&a);
    for(int i=2;i<a;i++){
        if(a%i==0){
            printf("not prime");
            break;
        }
        if(i==a/2){
            printf("prime");
            break;
        }
    }
}