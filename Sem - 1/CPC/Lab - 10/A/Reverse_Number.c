#include<stdio.h>
void main(){
    int n;
    printf("Enter Number : ");
    scanf("%d",&n);
    printf("Reverse of %d is ",n);
    while(n != 0){
        printf("%d",n%10);
        n/=10;
    }
    printf(".\n");
}