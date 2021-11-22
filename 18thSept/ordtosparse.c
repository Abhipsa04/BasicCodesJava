/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Program to transform ordinary to sparse matrix
#include <stdio.h>
#define max 20
int main()
{
    int i,j,m,n,k=1;
    
    int S[max][3];
    printf("Enter the no. of Rows and Columns: \n");
    scanf("%d%d",&m,&n);
    int a[m][n];
    printf("Enter the elements of the matrix:\n ");
    for(i=0; i<m; i++)
    { for(j=0; j<n; j++)
       { printf("Enter the element of a[%d][%d]: ",i,j);
         scanf("%d",&a[i][j]);
       }
    }
    printf("The ordinary matrix is: \n");
     for(i=0; i<m; i++)
    { for(j=0; j<n; j++)
       { 
         printf(" %d",a[i][j]);
       }
       printf("\n");
    }
    S[0][0]=m;
    S[0][1]=n;
     for(i=0; i<m; i++)
    { for(j=0; j<n; j++)
       { if(a[i][j]!=0)
          {
              S[k][0]=i;
              S[k][1]=j;
              S[k][2]=a[i][j];
              k++;
          }
       }
    }
    
    S[0][2]=k-1;
    printf("The sparse matrix is: \n");
    for(i=0; i<k; i++)
    { for(j=0; j<3; j++)
       { 
         printf(" %d",S[i][j]);
       }
       printf("\n");
    }

    return 0;
}


