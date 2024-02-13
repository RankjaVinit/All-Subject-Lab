#include <stdio.h>
    struct Employee
    {
        char employeeName[30];
        int exp;
        int salary;
    };
    
void main() {
    int i ;
    struct Employee e[5];
    for ( i = 0; i < 5; i++)
    {
        printf("Enter Employee name: " );
        scanf("%s",&e[i].employeeName);
        printf("Enter Experience: " );
        scanf("%d",&e[i].exp);
        printf("Enter Salary: " );
        scanf("%d",&e[i].salary);
        
        
    }
    printf(" \n");
    
    for ( i = 0; i < 5; i++)
    {
            printf("Employee Name %s \n",e[i].employeeName);
            printf("Experience %d \n",e[i].exp);
            printf("Salary %d \n",e[i].salary);
        
    }

    
}