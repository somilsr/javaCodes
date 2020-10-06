//example on call by class 
class human
{
int age;
String name;
double ht,wt;
char g;//gender
}
class demo1
{
	public static void main(String [] agrs)
	{
		//age=50;
		//human.age=50;
		human ob= new human();
		ob.age=50;
		ob.name="naresh";
		ob.wt=58;
		ob.ht=5.5;
		ob.g='m';
	   System.out.println(ob.name +"\t"+ ob.age+"\t"+ob.ht+"\t"+ob.wt+"\t"+ob.g+"\n");
       	System.out.println(ob.age);
		System.out.println(ob.ht);
		System.out.println(ob.wt);
		System.out.println(ob.g);

	}
}