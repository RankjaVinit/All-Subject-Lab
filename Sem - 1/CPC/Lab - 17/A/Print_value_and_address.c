#include<stdio.h>
void main(){
    int n = 123;
    int *p = &n;
    printf("%p\n",p);
    printf("%d\n",*p);
}