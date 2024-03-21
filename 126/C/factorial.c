#include<stdio.h>
int fac(int);
void main(){
    int a=5,r;
    r =fac(a);
    printf("%d",r);

}
int fac(int a){
    if(a==1){
       return 1;}
     else{
        return a*fac(a-1);
       }
}
