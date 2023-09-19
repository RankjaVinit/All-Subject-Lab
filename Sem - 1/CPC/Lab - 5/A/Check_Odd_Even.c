#include<stdio.h>
void main(){
    int a;
    printf("Enter Any Number : ");
    scanf("%d",&a);
    if(a == 0)printf("'0' is nither even nor odd.\n");
    else(a%2 == 0) ? printf("%d is Even.\n",a) : printf("%d is Odd.\n",a);
}