class sample 
{
 sample ob1=new sample();// valid
private sample ()
    {
    System.out.println(" invoked");
    }
  }

  public class cons3
  {
    public static void main(String [] agrs)
    {
    // sample ob=new sample ();//CTE
     //System s = new System();//CTE
     //Runtime r= new Runtime();//CTE
	 System.out.println(ob1.sample);
     }
    }

  
