#include<stdio.h>
void main(){
    int n, m;
    int *Pn = &n, *Pm = &m;
    printf("Enter Two number : ");
    scanf("%d %d", Pn, Pm);
    printf("Sum = '%d'\n",*Pn + *Pm);
}