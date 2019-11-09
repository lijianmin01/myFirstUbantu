#include <stdio.h>
#define Status int
#define OK 1
#define ERROR 0
#define INFEASIBLE -1

#define MAXSTRLEN 255
typedef unsigned char SString[MAXSTRLEN + 1];

//串赋值函数，完成将chars指向的字符串赋值给T指向的定长顺序串
Status StrAssign(SString T, char *chars)
{
        int i;
        T[0] = 0;
        for (i = 0; chars[i] != '\0'; i++)
        {
                T[i + 1] = chars[i];
                T[0]++;
        }
        T[i] = '\0';
        return OK;
}

//将字符串T，插入到S所指向串的第pos个位置，
//若发生截断的话，返回INFEASIBLE，若pos位置不合法的话返回ERROR，若插入成功的话，返回OK;
Status StrInsert(SString S, int pos, SString T)
{
        if (pos < 1 || pos > S[0])
        {
                return ERROR;
        }
        if (S[0] + T[0] > MAXSTRLEN)
        {
                return INFEASIBLE;
        }
        else
        {
                int i;
                int cnt = S[0];
                for (i = 0; i < S[0] - pos; i++)
                {
                        S[cnt - i + pos] = S[cnt - i];
                }
                for (i = 1; i < pos + 1; i++)
                {
                        S[pos + i] = T[i];
                }

                return OK;
        }
}

//打印串中字符
void PrintStr(SString S)
{
        int i;
        for (i = 1; i<=S[0]; i++)
        {
                printf("%c", S[i]);
        }
}
int main(void)
{
        SString S, T;
        Status result;
        StrAssign(S, "abcdefhijklmn");
        StrAssign(T, "UVWXYZ");
        result = StrInsert(S, 4, T);
        if (OK == result)
        {
                printf("未发生截断，结果是：");
                PrintStr(S);
        }
        else if (INFEASIBLE == result)
        {
                printf("发生截断!\n");
        }
        else
        {
                printf("插入位置有误!\n");
        }

        return 0;
}