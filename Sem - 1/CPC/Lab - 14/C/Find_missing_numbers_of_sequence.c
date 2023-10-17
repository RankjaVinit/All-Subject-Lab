#include<stdio.h>
void main(){
    int n;
    printf("How many number do you want to Enter : ");
    scanf("%d",&n);
    int arr[n], i, j, min, p, d = 0, x = 0;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
    }
    for(i = 0;i < n - 1;i++){
        min = arr[i];
        p = i;
        for(j = i + 1;j < n;j++){
            if(min > arr[j]){
                min = arr[j];
                p = j;
            }
        }
        arr[p] = arr[i];
        arr[i] = min;
    }
    printf("\nReamaining Numbers :-  ");
    for(i = 0;i < n - 1;i++){
        for(j = 1;arr[i + 1] > arr[i] + j;j++) printf("%d, ",arr[i] + j);
    }
    printf("\b\b \n");
}