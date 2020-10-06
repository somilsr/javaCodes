public class Book
{
	//properties
	private int id;
	private String name,author;
	private double price;
	//setters
	public void setId(int i){
		id =i;
	}
	public void setName(String n){
		name=n;
	}
	public void setAuthor(String a){
		author=a;
	}
	public void setPrice(double p){
		price=p;
	}
	//getters
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getAuthor(){
		return author;
	}
	public double getPrice(){
		return price;
	}
}

