#include<stdio.h>
void main(){
    int n = 100, m = 123;
    int *Pn = &n, *Pm = &m;
    *Pn = *Pn + *Pm;
    *Pm = *Pn - *Pm;
    *Pn = *Pn - *Pm;
    printf("%d \n%d \n",n,m);
}