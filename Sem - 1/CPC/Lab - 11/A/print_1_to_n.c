#include<stdio.h>
void main(){
    int i,n;
    printf("Enter Number : ");
    scanf("%d",&n);
    for(i = 1;i <= n;i++){
        printf("%d, ",i);
    }
    printf("\b\b.\n");
}