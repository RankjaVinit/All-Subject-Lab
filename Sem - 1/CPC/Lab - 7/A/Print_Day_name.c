#include<stdio.h>
void main(){
    int n;
    printf("Enter No. : ");
    scanf("%d",&n);
    n = n%7;
    switch(n){
case 1 : printf("\nMonday\n");
    break;
case 2 : printf("\nTuesday\n");
    break;
case 3 : printf("\nWednesday\n");
    break;
case 4 : printf("\nThusday\n");
    break;
case 5 : printf("\nFriday\n");
    break;
case 6 : printf("\nSartaday\n");
    break;
default : printf("\nSunday\n");
    }
}
        