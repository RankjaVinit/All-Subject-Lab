#include<stdio.h>
int Max(int , int);
void main(){
    int a,b,max;
    printf("Enter Two number : ");
    scanf("%d %d",&a,&b);
    max = Max(a,b);
    printf("Max = '%d', Min = '%d'.\n",max,a + b - max);
}
int Max(int a, int b){
    return (a < b)?b:a;
}