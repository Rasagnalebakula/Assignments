public class Date {
int day;
int month;
int year;
Date(){
	System.out.println("default constructor is called");
}
Date(int day, int month,int year){
this.day=day;
this.month=month;
this.year=year;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public void PrintDate() {
	System.out.println(getDay()+"/"+getMonth()+"/"+getYear());
}
public void SwapDate() {
	
}
public static void main(String[] args) {  
	Date cons=new Date();
Date date=new Date(20,02,1997);
System.out.println("Using parameterized constructor date is");
date.PrintDate();
System.out.println("Using getters and setters date is");
date.setDay(12);
date.setMonth(05);
date.setYear(1991);
date.PrintDate();

}}
