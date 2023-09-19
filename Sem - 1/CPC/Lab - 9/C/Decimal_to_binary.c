#include<stdio.h>
void main(){
    int n;
    long a = 0,i = 0;
    printf("Enter Number : ");
    scanf("%d",&n);
    if(n == 0) printf("0");
    while(n != 0){
        a = a*10 + n%2;
        n/=2;
        i++;
    }
    while(i != 0){
        printf("%d",a%10);
        a/=10;
        i--;
    }
    printf("\n");
}