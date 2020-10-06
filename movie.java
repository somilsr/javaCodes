import java. util .Scanner;
public class movie

{
	public static void main(String[] args) 
	{
				
		Scanner in = new Scanner (System.in);
		System.out.println("\nEnter no of movies database ");
		int n = in.nextInt();

		Movie1[] movies=new Movie1[n];

		if(n<= 1 && n<=5)
		n=in.nextInt();

//private String Director, Name,Cast, RealeaseDate,Languages, Songs, Duration, Releasepartner, sponser;

		for (int i=0;i<n ; i++ )
		{
			movies[i]= new Movie1();
			System.out.println("Enter Sno ");
			movies[i].setSno(in.nextInt());

			System.out.println("Enter name");
			movies[i].setName(in.next());
			
			System.out.println("Enter Director name ");
			movies[i].setDirector(in.next());
			System.out.println("Enter Cast ");
			movies[i].setCast(in.next());
			System.out.println("Enter release date of movie ");
			movies[i].setRealeaseDate(in.next());
			System.out.println("Enter Language release of movie ");
			movies[i].setLanguages(in.next());
			System.out.println("Enter song ");
			movies[i].setSongs(in.next());
			System.out.println("Enter movie duration ");
			movies[i].setDuration(in.next());
			System.out.println("Enter Release partner ");
			movies[i].setReleasepartner(in.next());
			System.out.println("Enter Sponser of movie ");
			movies[i].setsponser(in.next());
			System.out.println("Enter budget of movie ");
			movies[i].setBudget(in.nextDouble());
			}

System.out.println("\n Sno\t Name\t Director\t Budget \t Cast \t RealeaseDate \t Languages \t Songs \t Duration \t Releasepartner \t sponser \t address of ");

			//System.out.println("\n sno \t name\t Director \t Budget \t AddressOf");
System.out.println("\n------\t---------\t-------------\t ---------\t---------------\t----------------\t-------------\t-----------\t-------------\t---------------\t------------\t---");
			
			for (Movie1 m:movies)
			{
				//System.out.println( m.getSno()+"\t"+m.getName()+"\t"+m.getDirector()+"\t"+m.getBudget()+"\t"+m);
				System.out.println(m.getSno()+"\t"+m.getName()+"\t"+m.getDirector()+"\t"+m.getBudget()+"\t"+
m.getCast()+"\t"+m.getRealeaseDate()+"\t"+m.getLanguages()+"\t"+m.getSongs()+"\t"+m.getDuration()+"\t"+
m.getReleasepartner()+"\t"+m.getsponser()+"\t"+m);
			}


		}
	}
