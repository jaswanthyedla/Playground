import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_len = sb.length();
        int bb[] = new int[26]; 
        for(int idx = 0; idx < 26; idx++){
            bb[idx] = 0;
        }
        for(int idx = 0; idx < str_len; idx++)
        {
            if(sb.charAt(idx) >= 'A' && sb.charAt(idx) <= 'Z')
            {
                bb[sb.charAt(idx) - 'A']++;
            }
            if(sb.charAt(idx) >= 'a' && sb.charAt(idx) <= 'z')
            {
                bb[sb.charAt(idx) - 'a']++;
            }  
        }
        for(int i = 0; i <= 25; i++)
        {
            if(bb[i] == 0)
            {
                char missing_alphabet = (char)(i + 'a');
                System.out.print(missing_alphabet + " ");
            }
        }
    }
}