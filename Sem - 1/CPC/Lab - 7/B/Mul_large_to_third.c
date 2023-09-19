#include<stdio.h>
void main(){
    int a,b,c;
    printf("Enter No.(A B C) : ");
    scanf("%d %d %d",&a,&b,&c);
    switch(a>b){
        case 1 : printf("Ans = %d\n",a*c);
                break;
        case 0 : printf("Ans = %d\n",b*c);        
    }
}