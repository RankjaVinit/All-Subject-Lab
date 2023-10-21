#include<stdio.h>
void main(){
    int arr[20][2], i;
    for(i = 0;i < 20;i++){
        printf("Enter Roll No. of student : ");
        scanf("%d",&arr[i][0]);
        printf("Enter Marks of Roll No.%d : ",arr[i][0]);
        scanf("%d",&arr[i][1]);
    }
    printf("Roll No.  Marks \n");
    for(i = 0;i < 20;i++){
        printf("   %2d      %3d\n",arr[i][0],arr[i][1]);
    }
}