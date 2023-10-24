#include<stdio.h>
void main(){
    int a,b;
    printf("Enter Range(A B) : ");
    scanf("%d %d",&a,&b);
    printf("Even Numbers Between %d To %d : \n",a,b);
    if(a%2 == 1)a++;
    while(a <= b){
        printf("%d, ",a);
        a+=2;
    }
}