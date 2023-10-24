#include<stdio.h>
void main(){
    int n;
    printf("Enter No. : ");
    scanf("%d",&n);
    n = n%7;
    switch(n){
        case 1 : 
        case 3 : 
        case 5 : 
        case 7 : 
        case 8 : 
        case 10 :
        case 12 : printf("\n31 Days\n");
                break; 
        case 4 : 
        case 6 : 
        case 9 : 
        case 11 : printf("\n30 Days\n");
                break; 
        case 2 : printf("\n28 Days\n");
                break;
        default : printf("\nInvalid\n");        
    }
}