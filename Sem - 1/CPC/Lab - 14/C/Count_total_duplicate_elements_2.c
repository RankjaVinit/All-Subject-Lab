#include<stdio.h>
void main(){
    int n;
    printf("How many number do you want to Enter : ");
    scanf("%d",&n);
    int arr[n], i, j, min, p, d = 0;
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
    for(i = 0;i < n - 1;i++){
        if(arr[i] == arr[i + 1])d++;
    }
    printf("There are %d Duplicate.\n",d);
}