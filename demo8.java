import java. util .Scanner;
public class Demo8

{
	public static void main(String[] args) 
	{
		//use
		// book Book = new book();
		
		Scanner in = new Scanner (System.in);
		System.out.println("\nEnter no of books");

		int n = in.nextInt();
		Book[] books=new Book[n];

		for (int i=0;i<n ; i++ )
		{
			books[i]=new Book ();
			System.out.println("Enter book id , book name, auther & price details");

			books[i].setId(in.nextInt());
			books[i].setName(in.next());
			books[i].setAuthor(in.next());
			books[i].setPrice(in.nextDouble());
			}

			System.out.println("\n\n id \t name\t author \t price \t Address");
			System.out.println("\n\nid \t ------\t --------- \t --------\t-----\t\n");
			
			for (Book b :books )
			{
				System.out.println( b.getId()+"\t"+b.getName()+"\t"+b.getAuthor()+"\t"+b.getPrice()+"\t"+b);

			}


		}
	}
