#include<stdio.h>
int add(int ,int );
void main(){
    int a,b;
    printf("Enter Two number : ");
    scanf("%d %d",&a,&b);
    int sum = add(a,b);
    printf("sum = '%d'.\n",sum);
}
int add(int a,int b){
    return a + b;
}
