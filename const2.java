class date
{
//properties
private int date ,year;
private String month;

//overloading
public date ()
{
  date=4;
  month ="jan";
  year=2020;
  }
public date (int d,String m,int y)
{
  date= d;
  month =m;
  year =y;
}
public date(int d,String m)
{
  date =d;
  month=m;
  year=0;
}
public date (int d)
{
date=d;
month="";
year=0;
}

public String getDate()
{
  return date+"/"+month+"/"+year;
 }

}

public class const2
{
  public static void main (String[] args)
  {
   date d1=new date();
   System.out.println(d1.getDate());

	date d2 =new date(12,"feb");
	System.out.println(d2.getDate());


date d3=new date(10,"feb" ,1996);
System.out.println(d3.getDate());

date d4 =new date(23);
System.out.println(d4.getDate());
  }
  }