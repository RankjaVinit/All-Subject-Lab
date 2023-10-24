#include<stdio.h>
void main(){
    int a,b,c;
    printf("Enter All sides : ");
    scanf("%d %d %d",&a,&b,&c);
    if(a == 0 || b == 0 || c == 0){
        printf("\nYour tringle is invalid.\n");
    }
    else if(a == b && b == c && a == c){
        printf("\nYour Tringle is equilateral Tringle.\n");
    }
    else if( ( a == b || b == c || a == c)  && ((a * a) == (b * b) + (c * c)  ||(b * b) == (a * a) + (c * c) || (c * c) == (b * b) + (a * a) ) ){
        printf("\nYour Tringle is Right Angled Isosceles triangle.\n");
    }
    else if(a == b || b == c || a == c){
        printf("\nYour Tringle is Isosceles triangle.\n");
    }
    else if((a * a) == (b * b) + (c * c)  ||(b * b) == (a * a) + (c * c) || (c * c) == (b * b) + (a * a) ){
        printf("\nYour Tringle is Right Angled triangle.\n");
    }
    else {
        printf("\nYour Tringle is Scalene triangle.\n");
    }
}