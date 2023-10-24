#include<stdio.h>
void main(){
    int n = 123;
    int *p = &n;
    printf("%d\n",p);
    printf("%d\n",*p);
}