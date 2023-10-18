#include<stdio.h>
void main(){
    int n;
    printf("Enter Number : ");
    scanf("%d",&n);
    int arr[n], i, s;
    for(i = 0;i < n;i++){
        printf("Enter No. %d : ",i + 1);
        scanf("%d",&arr[i]);
    }
    printf("Which Number do you want to Search in your data : ");
    scanf("%d",&s);
    printf("The Number '%d' is in element No. : ",s);
    for(i = 0;i < n;i++){
        if(s == arr[i]) printf("%d, ",i + 1);
    }
    printf("\b\b \n");
}