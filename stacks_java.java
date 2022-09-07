public class stacks_java {
    private int [] Arr;
    private int count;
    public stacks_java()
    {
        Arr = new int[2];
        count=0;
    }

    public void push(int item)
    {
        if(Arr.length==count)
        {
            int [] newArr = new int[count*2];
            for(int i=0;i<count;i++)
            {
                newArr[i]= Arr[i];
            }
            Arr=newArr;
        }
      Arr[count]=item;
      count++;
    }
    public void pop()
    {
        Arr[count]=0;
        count--;
    }
    public int peek()
    {
        return Arr[count-1];
    }
    public boolean isEmpty()
    {
        if(Arr==null)
            return true;
        else
        return false;
    }
    public void print()
    {
        for(int i=0; i<count;i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public static void main(String [] args)
    {
       stacks_java stack = new stacks_java();
       stack.push(33);
      stack.push(33);
      stack.push(33);
      stack.pop();
      stack.push(2);
       stack.print();
      System.out.println(stack.peek());
      stack.print();
      System.out.println(stack.isEmpty());

    }
}
