#include<stdio.h>
void main(){
    char ch[100];
    printf("Enter Name : ");
    scanf("%[^\n]s",ch);
    int i;
    for(i = 0;*(ch + i) != '\0';i++);
    printf("length of string  = '%d'.\n",i);
}