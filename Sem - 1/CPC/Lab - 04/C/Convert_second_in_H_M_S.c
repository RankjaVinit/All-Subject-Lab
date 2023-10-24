#include<stdio.h>
void main(){
    double second;
    printf("\nEnter Total Second : ");
    scanf("%lf",&second);
    int H, M, S;
    H = second/3600;
    M = (second - ( H * 3600 ))/60;
    S = (second - ((H * 3600) + (M * 60)));
    printf("\nHour : Minute : Second --> %d H : %d M : %d S \n",H,M,S);
}