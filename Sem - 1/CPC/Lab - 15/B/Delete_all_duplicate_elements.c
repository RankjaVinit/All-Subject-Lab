#include<stdio.h>
void main(){
    int n;
    printf("How many number do you want to Enter  : ");
    scanf("%d",&n);
    int arr[n], i, j, k;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
    }
    for(i = 0;i < n - 1;i++){
        for(j = i + 1;j < n;j++){
            if(arr[i] == arr[j]){
                for(k = j;k < n - 1;k++) arr[k] = arr[k + 1];
                n--;
                j--;
            }
        }
    }
    printf("your data after delete all duplicate elements : ");
    for(i = 0;i < n;i++){
        printf("%d, ",arr[i]);
    }
    printf("\b\b \n");
}   