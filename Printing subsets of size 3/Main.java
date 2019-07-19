import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[5];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
    }
      for(int i=0;i<=n-2;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          for(int k=j+1;k<n;k++)
          {
            System.out.print("("+a[i]+","+" "+a[j]+","+" "+a[k]+")");
            System.out.print(" ");
          }
          
	}
        System.out.print("\n");
      }
    }
}
