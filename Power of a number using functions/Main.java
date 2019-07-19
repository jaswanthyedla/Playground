import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int expo=sc.nextInt();
    int r=power(base,expo);
    System.out.print(r);
  }
  public static int power(int base,int expo)
  {
    int sum=1;
    while(expo>0)
    {
      sum=sum*base;
      expo--;
    }
    return sum;
  }
}
      