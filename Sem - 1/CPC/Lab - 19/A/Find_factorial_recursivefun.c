#include<stdio.h>
int fact(int);
void main(){
    int n, fac;
    printf("Enter Number : ");
    scanf("%d",&n);
    fac = fact(n);
    printf("%d! = '%d'\n",n,fac);
}
int fact(int n){
    if(n > 0)return (n * fact(n - 1));
    else return 1;
}