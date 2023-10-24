#include<stdio.h>
void main(){
    double days;
    printf("\nEnter Total Days : ");
    scanf("%lf",&days);
    int Y, W, D;
    Y = days/365;
    W = (days - ( Y * 365 ))/7;
    D = (days - ((Y * 365) + (W * 7)));
    printf("\nYears : Weeks : Days --> %d Y : %d W : %d D \n",Y,W,D);
}