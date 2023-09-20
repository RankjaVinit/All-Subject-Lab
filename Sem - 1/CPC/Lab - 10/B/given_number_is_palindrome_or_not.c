#include<stdio.h>
void main(){
    int n, r = 0,a;
    printf("Enter Number : ");
    scanf("%d",&n);
    a = n;
    if(n < 0) printf("Given number is Not Palindrome. \n");
    else {
        while(n != 0){
            r = r*10 + n%10;
            n/=10;
        }
        if(a == r) printf("Given number is Palindrome.\n");
        else printf("Given number is Not Palindrome. \n");
    }
}