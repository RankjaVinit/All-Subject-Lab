#include<stdio.h>
void main(){
    double f;
    printf("Enter Temperature(In Fahrenheit) : ");
    scanf("%lf",&f);
    printf("Your Temperature In Celsius : %lf",(((f - 32) * 5) / 9));
}