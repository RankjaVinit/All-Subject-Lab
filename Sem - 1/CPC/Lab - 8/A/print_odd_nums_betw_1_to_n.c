#include<stdio.h>
void main(){
    int a;
    printf("Enter No. : ");
    scanf("%d",&a);
    int i = 1;
    printf("Odd Numbers Between 1 To %d : \n",a);
    while(i <= a){
        printf("%d, ",i);
        i+=2;
    }
}