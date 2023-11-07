#include<stdio.h>
void main(){
    char arr[40], ch;
    int i;
    printf("Enter Name : ");
    scanf("%[^\n]s",arr);
    printf("Enter char : ");
    scanf(" %c",&ch);
    printf("\n%s\n",arr);
    for(i = 0;arr[i] != '\0';i++){
        if(arr[i] == ch) printf("^");
        else printf(" ");
    }
    printf("\n");
}