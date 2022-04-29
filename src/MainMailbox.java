import java.util.Date;

public class MainMailbox {

	public static void main(String[] args) {
		Mailbox mb=new Mailbox(new beforeFrom());
		Date fecha1 = new Date(116, 5,1);
		Date fecha2 = new Date(116, 5,2);
		Date fecha3 = new Date(116, 5,3);
		Email a1=new Email("Pepe1","Saludo1","¿Que tal?1",fecha1,Priority.Prioridad1);
		Email a2=new Email("Pepe2","Saludo2","¿Que tal?2",fecha2,Priority.Prioridad2);
		Email a3=new Email("Pepe3","Saludo3","¿Que tal?3",fecha3,Priority.Prioridad3);
		mb.add(a1);
		mb.add(a2);
		mb.add(a3);
		mb.show();
		mb.setOrden(new beforeSubject());
	}

}
