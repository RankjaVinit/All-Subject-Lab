#include<stdio.h>
void main(){
    int a, b;
    printf("Enter No.1 : ");
    scanf("%d",&a);
    printf("Enter No.2 : ");
    scanf("%d",&b);
    int temp = a;
    a = b;
    b = temp;
    printf("\nNo.1 = %d, No.2 = %d.\n",a,b);
}