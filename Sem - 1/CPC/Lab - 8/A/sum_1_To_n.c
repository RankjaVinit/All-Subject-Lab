#include<stdio.h>
void main(){
    int n,i = 1,sum = 0;
    printf("Enter Number : ");
    scanf("%d",&n);
    while(i <= n){
        sum+=i;
        i++;
    }
    printf("Sum = %d\n",sum);
}