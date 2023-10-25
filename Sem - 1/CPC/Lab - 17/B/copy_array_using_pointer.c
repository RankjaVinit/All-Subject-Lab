#include<stdio.h>
void main(){
    int arr[10] = {1,3,6,9,12,34,56,78,90,12}, i, copy[10];
    for(i = 0;i < 10;i++){
        *(copy + i) = *(arr + i);
    }
    for(i = 0;i < 10;i++){
        printf("%d, ",*(copy + i));
    }
    printf("\b\b \n");
}