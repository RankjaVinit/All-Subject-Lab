#include<stdio.h>
void main(){
    int n,term = 1,i,j;
    printf("Enter Number : ");
    scanf("%d",&n);
    for(i = 0;i <= n - 1;i++){
        for(j = n - 1;j > i;j--){
            printf(" ");
        }
        term = 1;
        printf("%d ",term);
        for(j = 1;j <= i;j++){
            term*=(i-j+1);
            term/=j;
            printf("%d ",term);
        }
        printf("\n");
    }
}