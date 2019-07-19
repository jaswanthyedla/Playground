import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=sumofnum(n);
      System.out.print(sum);
	}
  public static int sumofnum(int num)
  {
    int value=0;
    for(int i=1;i<=num;i++)
    {
     value=value+i;
	}
    return value;
  }
}