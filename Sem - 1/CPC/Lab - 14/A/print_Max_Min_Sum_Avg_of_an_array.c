#include<stdio.h>
void main(){
    int n;
    printf("How many Number do you want to Enter : ");
    scanf("%d",&n);
    int arr[n], sum = 0, min, max, i;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
    }
    min = arr[0];
    max = arr[0];
    for(i = 0;i < n;i++){
        sum+=arr[i];
        if(min > arr[i]) min = arr[i];
        else if(max < arr[i]) max = arr[i];
    }
    printf("sum = %d\navg = %.2f\nmin = %d\nmax = %d\n",sum,sum/(double)n,min,max);
}