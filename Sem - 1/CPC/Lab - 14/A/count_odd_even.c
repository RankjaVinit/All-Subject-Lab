#include<stdio.h>
void main(){
    int n, ec = 0, oc = 0;
    printf("How many Number do you want to Enter : ");
    scanf("%d",&n);
    int arr[n], i;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
        (arr[i] % 2 == 0)?ec++:oc++;
    }
    printf("odd count = %d, even count = %d.",oc,ec);
}