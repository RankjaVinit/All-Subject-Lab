#include<stdio.h>
#include<math.h>
void main(){
    int n;
    printf("How many number do you want to Enter : ");
    scanf("%d",&n);
    int arr[n], sum = 0, pro = 1, i;
    double  revsum = 0;
    for(i = 0;i < n;i++){
        printf("Enter No.%d : ",i + 1);
        scanf("%d",&arr[i]);
        sum+=arr[i];
        pro*=arr[i];
        revsum+=1/(double)arr[i];
    }
    printf("Avg = %.3lf\n",sum/(double)n);
    printf("Geometric mean = %.3lf\n",pow(pro,1/(double)n));
    printf("Harmonic mean = %.3lf\n",n/(double)revsum);
}