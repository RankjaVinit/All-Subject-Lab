#include<stdio.h>
void main(){
    int n,l,i;
    printf("Enter Number : ");
    scanf("%d",&n);
    l = n%10;
    while (n != 0)
    {
        i = n;
        n/=10;
    }
    printf("Sum = %d\n",i + l);

}