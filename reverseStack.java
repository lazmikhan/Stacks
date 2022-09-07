import java.util.*;
public class reverseStack {
    private char [] Arr= new char[10];
    private int count;

    public void reverseStack()
    {
        
        count =0;
    }
    public String reverse(String myStr)
    {
        

        for(int i=0;i<myStr.length();i++)
        {
             Arr[count]=myStr.charAt(i);
             count++;
        }
  char []  newArr= new char[10];
        for(int i=0;i<count;i++)
        {
            
               newArr[i]= Arr[(count-1)-i];
            
        }

        Arr= newArr;
       StringBuilder sb = new StringBuilder();
       return sb.append(Arr).toString();
        
    }
    public void print()
    {
        for(int i=0;i<count;i++)
        {
            System.out.print(Arr[i]);
           
        }

    }
    public static void main(String [] args)
    {
        String myString ="lazmikhan";
        reverseStack stack = new reverseStack();
        
       System.out.println( stack.reverse(myString));
       // stack.print();

    }
}
