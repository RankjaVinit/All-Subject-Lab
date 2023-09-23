#include<stdio.h>
void main(){
    int n,i,f = 1;
    printf("Enter Number : ");
    scanf("%d",&n);
    for(i = 1;i <= n;i++){
        f*=i;
    }
    printf("%d! = %d\n",n,f);
}