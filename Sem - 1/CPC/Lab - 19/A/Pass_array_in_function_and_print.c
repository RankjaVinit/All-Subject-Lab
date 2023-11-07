#include<stdio.h>
void array(int arr[]);
void main(){
    int arr[] = {1,2,3,4,5,6};
    array(arr);
}
void array(int arr[]){
    int i;
    for(i = 0;i < 6;i++){
        printf("%d, ",arr[i]);
    }
}