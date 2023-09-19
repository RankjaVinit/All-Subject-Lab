#include<stdio.h>
void main(){
    int a,b ;
    printf("Enter No.(A B) : ");
    scanf("%d %d",&a,&b);
    switch (a ^ b)
    {
    case 0 : printf("You Entered equal Number.\n");
        break;
    default : printf("You Entered Unequal Number.\n");
    }
}