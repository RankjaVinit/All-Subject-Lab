#include<stdio.h>
#include<math.h>
void main(){
    int a,b,c;
    printf("Enter All cofficient (a,b,c) : ");
    scanf("%d %d %d",&a,&b,&c);
    float D = (b * b) - (4 * a * c);
    if(D < 0){
        printf("\nRoots are Imaginary.\n");
    }
    else if(D == 0){
        printf("\nRoots are Equal and it is '%f'\n",(-1 * b)/(2.0 * a));
    }
    else{
        float r1 = ((-1 * b) + (sqrt(D)))/(2.0 * a), r2 = ((-1 * b) - (sqrt(D)))/(2.0 * a);
        printf("\nRoots are '%f' and '%f'.\n",r1,r2);
    }
}