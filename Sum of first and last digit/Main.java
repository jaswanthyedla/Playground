import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int n,r,rev=0,fd,id,s;
      Scanner in=new Scanner(System.in);
       n= in.nextInt();
      id=n%10;
      while(n>0)
      {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
	}
      fd=rev%10;
      s=fd+id;
      System.out.println(s);
}
}