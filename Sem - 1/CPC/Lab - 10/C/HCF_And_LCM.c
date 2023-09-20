#include<stdio.h>
void main(){
    int a,b,HCF = 1,temp;
    printf("Enter Numbers (A B) :");
    scanf("%d %d",&a,&b);
    int s = (a<b)?a:b,i = 2;
    while (i <= s)
    {
        if(a % i == 0 && b % i == 0) HCF = i;
        i++;
    }
    int LCM = (a * b)/HCF;
    printf("\nHCF of %d and %d = %d\nLCM of %d and %d = %d\n",a,b,HCF,a,b,LCM);
}