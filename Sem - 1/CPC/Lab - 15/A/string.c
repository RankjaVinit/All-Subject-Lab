#include<stdio.h>
void main(){
    char str[100], i;
    printf("Enter Your Full Name : ");
    scanf("%[^\n]s",str);
    printf("You Entered : ");
    for(i = 0;str[i] != '\0';i++){
        printf("%c",str[i]);
    }
    printf(".\nYour Name is of '%d' Letter.\n",i);
}