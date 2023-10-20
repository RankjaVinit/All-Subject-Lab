#include<stdio.h>
void main(){
    int n;
    printf("how many number do want to Enter : ");
    scanf("%d",&n);
    int arr[n], i, j, min, p, in;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
    }
    for(i = 0;i < n - 1;i++){
        min = arr[i];
        p = i;
        for(j = i;j < n;j++){
            if(min > arr[j]){
                 min = arr[j];
                 p = j;
            }
        }
        arr[p] = arr[i];
        arr[i] = min;
    }
    printf("Which Number do you want to add in your data : ");
    scanf("%d",&in);
    j = 0;
    for(i = 0;i < n;i++){
        if(arr[i] > in && j == 0){
            printf("%d, ",in);
            i--;
            j = 1;
        }
        else printf("%d, ",arr[i]);
    }
    if(j == 0) printf("%d, ",in);
    printf("\b\b \n");
}