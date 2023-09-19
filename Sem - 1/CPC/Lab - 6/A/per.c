#include<stdio.h>
void main(){
    int m1,m2,m3,m4,m5;
    printf("Enter All Subject Marks : ");
    scanf("%d %d %d %d %d",&m1,&m2,&m3,&m4,&m5);
    float pr = (m1 + m2 + m3 + m4 + m5)/5.0;
    if(pr <= 35)printf("You are Fail.(Try Next Time)\n");
    else if(pr <= 45)printf("You are Pass.\n");
    else if(pr <= 60)printf("You are Second.\n");
    else if(pr <= 70)printf("You are First.\n");
    else if(pr > 70)printf("You are Distinction.\n");
}