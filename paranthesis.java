import java.io.*;
import java.util.*;
public class paranthesis {
    public static void main(String args[])
    {
        String str;
        int c=0;
        Scanner s=new Scanner(System.in);
        str=s.next();
        char p[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
           if( p[i]==('(') && p[i+1]==')')
               c++;
        }
        System.out.println(c);
    }
    
    
}
