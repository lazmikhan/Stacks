public class twoStacks {
    private int [] Arr= new int[10];
    private int count1;
    private int count2;
public twoStacks()
{
    count1=0;
    count2=0;
}
    public void push1(int item)
    {
      if(count2!=0)
      {
        for(int i=count2;i>=count1;i--)
        {
            Arr[i+1]= Arr[i];
        }
        count2++;
      }
        Arr[count1]=item;
        count1++;
    }
    public void push2(int item)
    {  if(count2==0)
         count2=count1+count2;
        
         else if(count1!=0)
         count2++;

        Arr[count2]=item;

         if(count1==0 && count2==0)
         count2++;
    }
     public void print()
     {
        
         if(count2!=0)
        {for(int i=0; i<count2+1;i++)
            System.out.println(Arr[i]);
        }
      
        else{
            for(int i=0; i<count1;i++)
            System.out.println(Arr[i]); 
        }
  
     }
    public static void main(String [] args)
    {
        twoStacks stacks= new twoStacks();
        
        stacks.push1(2);
        stacks.push2(3);
        stacks.push2(4);
        stacks.push2(8);
        stacks.push1(33);
        stacks.push2(80);
        stacks.push2(80);
        stacks.push1(7);
        stacks.push2(3);
        stacks.push2(3);

        stacks.print();
    }

}
