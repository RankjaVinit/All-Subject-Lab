#include<stdio.h>
void main(){
    int n,sum = 1,i = 2;
    printf("Enter Number : ");
    scanf("%d",&n);
    while(i <= n/2){
        if(n%i==0) sum+=i;
        i++;
    }
    if(sum == n) printf("%d is Prefect Number. \n",n);
    else printf("%d is Not a Perfect Number. \n",n);
}