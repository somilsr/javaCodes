class Date 
{
 private int date ,year;
 private String month;

 public void setdate(int date)
 {
 this.date=date;
 }
 public void setYear(int year)
 {
	 if (year>0 && year <2021)
	 {
		 this.year=year;
	 }else
	 {
		 System.out.println("ReEneter" );
		//Date.setYear(int year);
	 }
 
 }
 public void setMonth(String month)
 {
 this.month=month;
 }

 int getDate()
 {
 return date;
 }
 String  getMonth()
 {
 return month;
 }
 int getYear()
 {
 return year;
 }

 String getDdate()
 { 
	 return getDate()+"/"+getMonth()+"/"+getYear();
	 }

}

