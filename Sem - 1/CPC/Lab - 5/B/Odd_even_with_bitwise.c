#include<stdio.h>
void main(){
    int a;
    printf("Enter No. : ");
    scanf("%d",&a);
    if( ( a | 1 ) == a ){
        printf("%d is Odd.\n",a);
    }
    else {
        printf("%d is Even.\n",a);
    }
}