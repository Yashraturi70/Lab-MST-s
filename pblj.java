import java.util.*;
class pblj{
    public static void main(String args[])
    {
        int v=0;
        int con=0;
        int d=0;
        int s=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isLetter(c))
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                {
                    v++;
                }
                else{
                    con++;
                }
            }
            else if(Character.isDigit(c))
            {
                d++;
            }
            else
            s++;
            if(con>3)
            break;
        }
        System.out.println("Vowels:"+v);
        System.out.println("Consonent:"+con);
        System.out.println("digits:"+d);
        System.out.println("special character:"+s);
        
    }
}