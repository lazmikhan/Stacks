import java.util.Stack;

public class balancedStack {
   
    public boolean blaanced(String input)
    {
       
        Stack <Character> newStack= new Stack<Character>();

     
        for( int i=0;i<input.length();i++)
        {
          if(isLeftBracket(input.charAt(i)))
            {
newStack.push(input.charAt(i));
            } 
            
           else if(input.charAt(i)==')'||input.charAt(i)=='}'||input.charAt(i)==']'||input.charAt(i)=='>')
            { 
              
            if(newStack.isEmpty())return false;
            if(input.charAt(i)=='}'&& newStack.peek()=='{'||
               input.charAt(i)==']'&& newStack.peek()=='['||
               input.charAt(i)==')'&& newStack.peek()=='('||
               input.charAt(i)=='>'&& newStack.peek()=='<')
                
              newStack.pop();
               else {  return false;}
            }
        }
        return newStack.empty();
      

    }

    private boolean isLeftBracket(char input)
    {
return input=='('
||input=='{'
||input=='['
||input=='<';
    }
    public static void main(String [] args)
    {
String str= "[(9)]";

balancedStack stk = new balancedStack();
System.out.println("The String is balanced?:"+    stk.blaanced(str));
    }
}
