import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j,k,count=1;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=(n-i);j++)
        {
          System.out.print(" ");
   		 }    
        for(k=1;k<=i;k++)
        {
          System.out.print(count + " ");
          count++;
        }
        System.out.println();
        
       }
    }
}
