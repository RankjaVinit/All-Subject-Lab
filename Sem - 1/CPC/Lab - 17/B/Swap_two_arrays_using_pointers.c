#include<stdio.h>
void main(){
    int arr[10] = {1,3,6,9,12,34,56,78,90,12}, i, copy[10] = {123,234,345,456,567,678,789,890,124,458};
    for(i = 0;i < 10;i++){
        *(copy + i) = *(copy + i) + *(arr + i);
        *(arr + i) = *(copy + i) - *(arr + i);
        *(copy + i) = *(copy + i) - *(arr + i);
    }
    for(i = 0;i < 10;i++){
        printf("%d  ,  %d\n", *(arr + i), *(copy + i));
    }
    printf("\b\b \n");
}