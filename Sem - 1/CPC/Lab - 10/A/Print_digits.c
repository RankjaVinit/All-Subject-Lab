#include<stdio.h>
void main(){
    int n, r = 0,i = 0;
    printf("Enter Number : ");
    scanf("%d",&n);
    if(n == 0) printf("0 ");
    while (n != 0)
    {
        r = r*10 + n%10;
        n/=10;
        i++;
    }
    while (i != 0)
    {
        printf("%d  ",r%10);
        r/=10;
        i--;
    }
    printf("\n");    
}