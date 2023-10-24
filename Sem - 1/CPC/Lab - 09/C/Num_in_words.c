#include<stdio.h>
void main(){
    int n, r = 0, i = 0;
    printf("Enter Number : ");
    scanf("%d",&n);
    while(n != 0){
        r = r*10 + n%10;
        n/=10;
        i++;
    }
    if(r == 0) printf("Zero ");
    while(i != 0){
        switch (r%10)
        {
        case 1:
            printf("One ");
            break;
        case 2:
            printf("Two ");
            break;    
        case 3:
            printf("Three ");
            break;
        case 4:
            printf("Four ");
            break;
        case 5:
            printf("Five ");
            break;
        case 6:
            printf("Six ");
            break;
        case 7:
            printf("Seven ");
            break;
        case 8:
            printf("Eight ");
            break;
        case 9:
            printf("Nine ");
            break;
        case 0:
            printf("Zero ");
            break;
        }
        r/=10;
        i--;
    }
    printf("\n");
}