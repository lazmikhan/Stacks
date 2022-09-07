import java.util.*;

public class usingOriginalStack {
    
    public String reverseString(String input)
    {
Stack<Character> stack = new Stack<Character>();

for(int i=0;i<input.length();i++)
stack.push(input.charAt(i));

StringBuffer str = new StringBuffer();
while(!stack.isEmpty())
str.append(stack.pop());
 

return str.toString();
    }

    public static void main(String [] args)
    {
        usingOriginalStack stackA = new usingOriginalStack();
        System.out.println(stackA.reverseString("raceca"));

    }
}
