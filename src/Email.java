import java.util.Date;

public class Email {
	private String from, subject, text;
	private Date date;
	private Priority priority;
	 
	public Email(String from1, String subject1,String text1,Date date1,Priority priority1) {
		from=from1;
		subject=subject1;
		text=text1;
		date=date1;
		priority=priority1;
		
	}
	public String toString() {
		return "[From: "+this.from+", Subject: "+this.subject+", Text: "+this.text+", Date: "
				+this.date.toString()+", Priority: "+this.priority+"]";
	}
}
