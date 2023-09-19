#include<stdio.h>
void main(){
    int u;
    float bill;
    printf("Enter Unit : ");
    scanf("%d",&u);
    if(u > 250){
        bill = 220 + ((u - 250) * 1.50);
    }
    else if(u > 150){
        bill = 100 + ((u - 150) * 1.20);
    }
    else if(u > 50){
        bill = 25 + ((u - 50) * 0.75);
    }
    else{
        bill = ((u) * 0.50);
    }
    bill+=(bill*0.20);
    printf("\nYour Bill is '%f'\n",bill);
}