#include<stdio.h>
void main()
{
  int n;
  printf("\n enter a number");
  scanf("%d",&n);
  if(n>0)
  {
    printf("\n number is positive");
  }
  else
  {
    if(n<0)
    {
      printf("\n number is negative");
     }
     else
     {
      printf("\nnumber is zero");
     }
    }
 }   
