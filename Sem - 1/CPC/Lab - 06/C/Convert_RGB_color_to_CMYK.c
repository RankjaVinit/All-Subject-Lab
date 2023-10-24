#include<stdio.h>
void main(){
    int r,g,b;
    double w,c,m,y,k,black;
    printf("Enter Colour Value Like (R G B) : ");
    scanf("%d %d %d",&r,&g,&b);
    if(r > 255 || g > 255 || b > 255) printf("\nInput is Invalid.\n");
    else if(r == 0 && g == 0 && b == 0) printf("\nC = 0, M = 0, Y = 0, K = 1\n");
    else {
        double r1 = r / 255.0,g1 = g / 255.0,b1 = b / 255.0;
        w = ((r1 > g1)?((r1 > b1)?r1:b1):((g1 > b1)?g1:b1));
        c = (w - r1)/w;
        m = (w - g1)/w;
        y = (w - b1)/w;
        black = 1 - w;
        printf("\nRed = %d, Green = %d, Blue = %d\n",r,g,b);
        printf("Cyan = %.3lf, Magenta = %.3lf, Yellow = %.3lf, Black = %.3lf, White = %.3lf\n",c,m,y,black,w);
    }
}