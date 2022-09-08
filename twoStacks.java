public class twoStacks {
    private int [] Arr= new int[10];
    private int count1;
    private int count2;
    private int inc;
public twoStacks()
{
    count1=0;
    count2=0;
    inc=0;
}
public boolean isFull1()
{
    if(count1==5)
    return true;
    return false;
}
public boolean isFull2()
{
    if(inc>=5)
    return true;
    return false;
}
    public void push1(int item)
    {
        isFull1();
       
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
    public void push2(int item){
    isFull2();
      
        count2= count1+inc;
        
        Arr[count2]= item;
    
         inc++;
         //count2++;
   
    }
    public void pop1()
    {
        Arr[count1-1]=0;
         if(count2!=0)
         {for(int i=count1;i<count2;i++)
            Arr[i-1]= Arr[i];
         }
         Arr[count2]=0;
         count1--;
         count2--;
     
    }
    public void pop2()
    {
        
 
        if(inc>0)
        {
            Arr[count2]=0;
            count2--;
           inc--;
        }
        
    }
    public boolean isEmpty1()
    {
        if(count1==0)
        {return true;}return false;
    }
    public boolean isEmpty2()
    {
        if(inc==0)
        {return true;}return false;
    }
    public void print2()
    {
       
     
       for(int i=0; i<Arr.length;i++)
           System.out.println(Arr[i]);
       
     
    
    }
     public void print()
     {
        
         if(count2!=0)
        {for(int i=0; i<=count2+1;i++)
            System.out.println(Arr[i]);
        }
      
        else{
            for(int i=0; i<count1;i++)
            System.out.println(Arr[i]); 
        }
        System.out.println(count1+" and"+count2); 
        System.out.println("val:"+Arr[5]); 
     }
    public static void main(String [] args)
    {
        twoStacks stacks= new twoStacks();
        



  

  stacks.push1(2229);
  stacks.push2(2229);


System.out.println(stacks.isEmpty2());


        stacks.print2();
    }

}
