#include<stdio.h>
void main(){
    int a,ec = 0,oc = 0,o = 0;
    int i = 0;
    while (i < 10)
    {
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&a);
        if(a == 0) o++;
        else if(a % 2 == 0) ec++;
        else oc++;
        i++;
    }
    printf("\nYou Entered Total %d Even And %d Odd Numbers",ec,oc);
    if(o > 0) printf(" And %d Zeros Which is neither Even nor Odd Number");
    printf(".\n\n");
}