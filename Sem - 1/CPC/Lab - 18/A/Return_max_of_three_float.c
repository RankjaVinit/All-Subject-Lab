#include<stdio.h>
float Max(float ,float ,float);
void main(){
    float a,b,c,max;
    printf("Enter three Number : ");
    scanf("%f %f %f",&a,&b,&c);
    max = Max(a,b,c);
    printf("Max = %f",max);
}
float Max(float a,float b,float c){
    return (a<b)?((b<c)?c:b):((a<c)?c:a);
}