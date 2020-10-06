
class employee
{
  private int id;
  private String name;
  private double salary;
 

  public void setId(int id )
	{
	  if (id>=1 && id<=50)
	  {
		   this.id=id;
		   System.out.print("wrong Entered");
	  }
	}

	public void setName(String name)
	{
		this.name =name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
}