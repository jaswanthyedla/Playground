import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=in.nextInt();
      int n2=in.nextInt();
      int gcd=GCD(n,n1,n2);
      System.out.print(gcd);
	}
  public static int GCD(int a,int b,int c)
  {
    int min;
    if(a<b&&a<c)
    {
      min=a;
	}
    else if(b<a&&b<c)
    {
      min=b;
    }
    else
    {
      min=c;
    }
    int hcf;
    for( hcf=min;hcf>=1;hcf--)
    {
     
      if(a%hcf==0&&b%hcf==0&&c%hcf==0)
      {
        break;
      }
    }
    return hcf;
  }
}
    