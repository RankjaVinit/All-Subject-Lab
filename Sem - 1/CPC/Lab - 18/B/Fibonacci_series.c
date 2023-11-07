#include<stdio.h>
void fibbo(int);
void main(){
    int n;
    printf("How many number do you want to print : ");
    scanf("%d",&n);
    fibbo(n);
}
void fibbo(int n){
    int i, a = 0, b = 1, s = 0;
    printf("Fibonacci Series : ");
    for(i = 0;i < n;i++){
        printf("%d, ",s);
        a = b;
        b = s;
        s = a + b;
    }
    printf("\b\b.\n");
}