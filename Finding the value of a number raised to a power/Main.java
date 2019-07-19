import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      int i=1;
      int sum=b;
      while(i<e)
      {
        sum=sum*b;
        i++;
    }
      System.out.print(sum);
}
}