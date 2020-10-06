public class marks extends s1
{
  private int t1,t2,t3, tot;
  private double avg;
  public void setMarks(int t1,int t2,int t3)
	{
  	this.t1=t1;
	this.t2=t2;
	this.t3=t3;
	}
public void getResult()
{
tot=t1+t2+t3;
avg=tot/3;
show();

System.out.println(tot);
System.out.println(avg);
}
}