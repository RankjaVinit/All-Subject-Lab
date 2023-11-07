#include<stdio.h>
void main(){
    char arr[40], rep, to;
    int i;
    printf("Enter Name : ");
    scanf("%[^\n]s",arr);
    printf("Enter char1 : ");
    scanf(" %c",&rep);
    printf("Enter char2 : ");
    scanf(" %c",&to);
    for(i = 0;arr[i] != '\0';i++){
        if(arr[i] == rep){
            arr[i] = to;
        }
    }
    printf("\n%s\n",arr);
}