#include<stdio.h>
void main(){
    int n;
    printf("How many numbers do you want to Enter : ");
    scanf("%d",&n);
    int arr[n], i, j, max, p;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
    }
    for(i = 0;i < 2;i++){
        max = arr[i];
        p = i;
        for(j = i;j < n;j++){
            if(max < arr[j]){
                max = arr[j];
                p = j;
            }
        }
        arr[p] = arr[i];
        arr[i] = max;
    }
    printf("Largest element is '%d' and Second Largest element is '%d'.\n",arr[0], arr[1]);
}