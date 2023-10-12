#include<stdio.h>
void main(){
    int n;
    printf("How many Number do you want to enter : ");
    scanf("%d",&n);
    int arr[n], sum = 0, g = 0, i;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
        sum+=arr[i];
    }
    for(i = 0;i < n;i++){
        if(arr[i] > sum/n) g++;
    }
    printf("%d Number are Greater then Average(%.3lf).",g,sum/(double)n);
}