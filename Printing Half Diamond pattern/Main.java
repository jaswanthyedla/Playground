import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j,k;
      int count=n-1;
     int temp=1;
      for(i=1;i<=n;i++)
      {
          for(j=1;j<=count;j++)
          {
           
              System.out.print(" ");
          }
        for(k=1;k<=temp;k++)
        {
          System.out.print("*");
	}
        count--;
        temp+=2;
        System.out.print("\n");
    }
}
}