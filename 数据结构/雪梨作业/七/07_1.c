#include<stdio.h>

int ContainSameElem(int *a,int m,int n)
{
    int flag=0;
    int q,i,j;
    int cnti,cntj;
    for(i=0;i<m*n;i++)
    {
        printf("%d\n",i);
    }
    for(q=0;q<m*n;q++)
    {
        cnti=q/4;
        cntj=q%3;
        for (i = 0; i < 4; i++)
        {
            for (j = 0; j < 3; j++)
            {
                if ((*(a+q)== (a + i * n)[j]) && (cnti != i && cntj != j))
                {
                    printf("a[%d][%d]=%d\n", cnti, cntj, *(a + q));
                    printf("a[%d][%d]=%d\n", i, j, *(a + q));
                }
            }
        }
    }
    
    return 0;
}
int main(void)
{
    int a[4][3] = {11, 12, 13, 24, 25, 26, 13, 38, 39, 40, 39, 42};
    if (ContainSameElem(a[0], 4, 3))
        printf("a有相同元素!\n");
    else
        printf("a无相同元素\n");

    return 0;
}