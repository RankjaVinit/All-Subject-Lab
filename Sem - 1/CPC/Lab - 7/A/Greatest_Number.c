#include<stdio.h>
void main(){
    int a,b,c;
    printf("Enter No.(A B C) : ");
    scanf("%d %d %d",&a,&b,&c);
    int max = ((a>b)?((a>c)?a:c):((b>c)?b:c));
    printf("Largest Number is : %d\n",max);
}