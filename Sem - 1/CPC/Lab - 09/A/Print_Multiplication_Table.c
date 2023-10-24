#include<stdio.h>
void main(){
    int i = 1, n;
    printf("Which Table Do want to Print : ");
    scanf("%d",&n);
    printf("\n");
    while(i <= 10){
        printf("%d * %d = %d\n",n,i,i*n);
        i++;
    }
}