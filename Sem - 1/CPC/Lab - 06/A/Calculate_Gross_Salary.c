#include<stdio.h>
void main(){
    int s;
    float gs;
    printf("Enter Basic Salary : ");
    scanf("%d",&s);
    if(s > 30000){
        gs = s + ( (s * 0.30) + (s * 0.95) );
    }
    else if(s > 20000){
        gs = s + ( (s * 0.25) + (s * 0.90) );
    }
    else if(s > 10000){
        gs = s + ( (s * 0.20) + (s * 0.80) );
    }
    printf("Gross Salary is : '%f' ",gs);
}