#include<stdio.h>
void main(){
    int n;
    printf("How many number do you want to Enter : ");
    scanf("%d",&n);
    int arr[n], i, min, j, p;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
    }
    for(i = 0;i < n - 1;i++){
        min = arr[i];
        for(j = i + 1;j < n;j++){
            if(min > arr[j]){
                min = arr[j];
                p = j;
            }
        }
        arr[p] = arr[i];
        arr[i] = min;
    }
    for(i = 0;i < n;i++){
        printf("%d, ",arr[i]);
    }
    printf("\b\b. \n");
}