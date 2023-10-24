#include<stdio.h>
void main(){
    int n, i = 1;
    printf("Enter NUmber : ");
    scanf("%d",&n);
    while(i <= n/2){
        if(n % i == 0){
            printf("%d, ",i);
        }
        i++;
    }
    printf("%d are the factors of %d.\n",n,n);
}