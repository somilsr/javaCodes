public class Movie1
{

	private int sno;

		private String Director, Name,Cast, RealeaseDate,Languages, Songs, 
					Duration, Releasepartner, sponser;

		private Double Budget;			//,BoxofficeCOllection

///SETTER methods

				public void setSno(int s)
				{
				sno=s;
				}
				public void setName (String n)
				{
				Name=n;
				}
				public void setCast (String c)
				{
				Cast=c;
				}public void setRealeaseDate (String rd)
				{
				RealeaseDate=rd;
				}public void setLanguages (String l)
				{
				Languages=l;
				}public void setSongs (String ss)
				{
				Songs=ss;
				}public void setDuration (String dd)
				{
				Duration=dd;
				}public void setReleasepartner (String rp)
				{
				Releasepartner=rp;
				}
				public void setsponser (String sp)
				{
				sponser=sp;
				}
				public void setDirector (String d)
				{
				Director=d;
				}
				public void setBudget (Double b)
				{
				Budget=b;
				}

//getMethods

			public int getSno()
			{
			return sno;
			}
			public String getName()
			{
			return Name;
			}
			public String getDirector()
			{
			return Director;
			}

			public Double getBudget()
			{
			return Budget;
			}
			public String getCast()
			{
			return Cast;
			}
			public String getRealeaseDate()
			{
			return RealeaseDate;
			}
			public String getLanguages()
			{
			return Languages;
			}
			public String getSongs()
			{
			return Songs;
			}
			public String getDuration()
			{
			return Duration;
			}
			public String getReleasepartner()
			{
			return Releasepartner;
			}
			public String getsponser()
			{
			return sponser;
			}

}