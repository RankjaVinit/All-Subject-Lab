#include<stdio.h>
void main(){
    int n,i,ans = 1;
    printf("Enter Number : ");
    scanf("%d",&n);
    while(i <= n){
        ans*=i;
        i++;
    }
    printf("%d! = %d\n",n,ans);
}