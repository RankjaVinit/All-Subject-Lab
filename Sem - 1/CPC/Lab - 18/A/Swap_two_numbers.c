#include<stdio.h>
void swapbyvalue(int , int);
void swapbyreference(int *, int*);
void main(){
    int a, b;
    printf("Enter Two number : ");
    scanf("%d %d",&a,&b);
    printf("\nBy value - \n");
    swapbyvalue(a,b);
    printf("In Main : a = '%d', b = '%d'.\n",a,b);
    printf("\nBy reference - \n");
    swapbyreference(&a,&b);
    printf("In Main : a = '%d', b = '%d'.\n",a,b);
}
void swapbyvalue(int a, int b){
    int temp = a;
    a = b;
    b = temp;
    printf("In swap : a = '%d', b = '%d'.\n",a,b);
}
void swapbyreference(int *a, int*b){
    int temp = *a;
    *a = *b;
    *b = temp;
    printf("In swap : a = '%d', b = '%d'.\n",*a,*b);
}
