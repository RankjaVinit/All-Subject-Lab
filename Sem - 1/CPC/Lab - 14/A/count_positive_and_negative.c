#include<stdio.h>
void main(){
    int n, pc = 0, nc = 0, c0 = 0;
    printf("How many Number do you want to Enter : ");
    scanf("%d",&n);
    int arr[n], i;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
        (arr[i] >= 0)?((arr[i] == 0)?c0++:pc++):nc++;
    }
    printf("+ve count = %d, -ve count = %d, '0' count = %d.",pc,nc,c0);
}