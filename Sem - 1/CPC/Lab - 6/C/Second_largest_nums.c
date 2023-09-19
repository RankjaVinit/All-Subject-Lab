#include<stdio.h>
void main(){
    int a,b,c,sl;
    printf("Enter Three Number : ");
    scanf("%d %d %d",&a,&b,&c);
    sl = (a>b)?((a>c)?((b>c)?b:c):a):((b>c)?((a>c)?a:c):b);
    printf("Second Largest Number is '%d'.",sl);
}