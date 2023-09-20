#include<stdio.h>
void main(){
    int n,a = 0;
    printf("Enter Number : ");
    scanf("%d",&n);
    int s = n;
    while (n != 0)
    {
        a+=((n%10)*(n%10)*(n%10));
        n/=10;
    }
    if(a == s) printf("Given number is Armstrong.\n");
    else printf("Given number is Not an Armstrong Number.\n");
}