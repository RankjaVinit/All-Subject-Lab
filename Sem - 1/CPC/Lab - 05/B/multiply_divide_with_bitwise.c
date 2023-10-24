#include<stdio.h>
void main(){
    int a;
    printf("Enter No. : ");
    scanf("%d",&a);
    printf("%d * 2 = %d",a,a<<1);
    double d = a >> 1;
    if(a%2 != 0) d += 0.5;
    printf("\n%d / 2 = %.1lf\n",a, d);
}