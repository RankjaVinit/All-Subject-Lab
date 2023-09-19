#include<stdio.h>
void main(){
    int a;
    printf("Enter Any Number : ");
    scanf("%d",&a);
    (a >= 0) ? printf("Number is Positive.\n") : printf("Number is Negative.\n");
}