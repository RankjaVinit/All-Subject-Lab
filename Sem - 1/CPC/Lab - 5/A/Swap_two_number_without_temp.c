#include<stdio.h>
void main(){
    int a, b;
    printf("Enter No.1 : ");
    scanf("%d",&a);
    printf("Enter No.2 : ");
    scanf("%d",&b);
    a = a + b;
    b = a - b;
    a = a - b;
    printf("\nNo.1 = %d, No.2 = %d.\n",a,b);
}