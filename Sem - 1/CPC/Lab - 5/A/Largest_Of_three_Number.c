#include<stdio.h>
void main(){
    int a, b, c, max;
    printf("Enter No.1 : ");
    scanf("%d",&a);
    printf("Enter No.2 : ");
    scanf("%d",&b);
    printf("Enter No.3 : ");
    scanf("%d",&c);
    max = (a>b&&a>c)?a:((b>c)?b:c);
    printf("\n'%d' is largest.\n",max);
}