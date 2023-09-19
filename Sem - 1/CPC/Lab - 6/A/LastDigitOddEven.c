#include<stdio.h>
void main(){
    int n;
    printf("Enter Number : ");
    scanf("%d",&n);
    if(((n%10)%2)==0){
        printf("Last Digit is Even.\n");
    }
    else{
        printf("Last Digit is Odd.\n");
    }
}