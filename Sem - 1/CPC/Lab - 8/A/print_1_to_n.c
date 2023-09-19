#include<stdio.h>
void main(){
    int n,a = 1;
    printf("Enter till which number do you want to print. : ");
    scanf("%d",&n);
    do{
        printf("%d\n",a);
        a++;
    }while (a <= n);
}