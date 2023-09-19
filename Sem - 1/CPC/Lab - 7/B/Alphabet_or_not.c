#include<stdio.h>
void main(){
    char a;
    printf("Enter Any Key : ");
    scanf("%c",&a);
    ((a>64 && a<91) || (a>96 && a<123))?printf("You Entered Alphabet.\n"):printf("It is not Alphabet.\n");
}