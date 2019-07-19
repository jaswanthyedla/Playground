import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int greatest=gonum(n,n1,n2);
      System.out.print(greatest);
	}
  public static int gonum(int a,int b,int c)
  {
    if(a>b&&a>c)
    {
      return a;
     
	}
    else if(b>a&&b>c)
    {
      return b;
}
    else
    {
      return c;
    }
  }
}