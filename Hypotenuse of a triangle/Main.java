#include<stdio.h>
#include<math.h>
int main()
{
  float p,b,hypotenuse;
  scanf("%f%f",&p,&b);
  (hypotenuse)=hypot(p,b);
  printf("%.2f",hypotenuse);
  return 0;
}