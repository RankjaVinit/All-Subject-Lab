#include<stdio.h>
void main(){
    int n,sum = 0,i,j;
    printf("Enter number : ");
    scanf("%d",&n);
    for(i = 1;i <= n;i++){
        for(j = 1;j <= i;j++){
            sum+=j;
        }
    }
    printf("sum of %d terms is : %d\n",n,sum);
}