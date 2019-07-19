import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int square=sq(n);
      System.out.print(square);
	} 
  public static int  sq(int num)
  {
    int sq=num*num;
    return sq;
}
}
