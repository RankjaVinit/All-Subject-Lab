#include<stdio.h>
void main(){
    char ch;
    printf("Enter Any Key : ");
    scanf("%c",&ch);
    if(ch <= 58 && ch >= 48){
        printf("\nYou Enter a Digit.\n");
    }
    else if(ch <= 90 && ch >= 65){
        printf("\nYou Enter a Upper Case.\n");
    }
    else if(ch <= 122 && ch >= 97){
        printf("\nYou Enter a Lower Case.\n");
    }
    else{
        printf("\nYou Enter a Special character .\n");
    }
}