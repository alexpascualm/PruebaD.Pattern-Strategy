import java.util.ArrayList;
import java.util.Iterator;

public class Mailbox {
	ArrayList<Email> Mails;
	private IEstrategia Orden;

	public Mailbox(IEstrategia Orden1) {
		Mails = new ArrayList<Email>();
		Orden=Orden1;
		
	}
	
	public void setOrden(IEstrategia orden) {
		Orden = orden;
	}

	public void add(Email a1) {
		this.Mails.add(a1);
	}
	public void show() {
		this.sort();
		Iterator<Email> iterator = Mails.iterator();
		while(iterator.hasNext()){
			String elemento = iterator.next().toString();
			System.out.println(elemento);
		}
	}

	private void sort() {
		 for ( int i = 2; i <= Mails.size()-1; i++ ) {
			 for ( int j = Mails.size()-1; j >= i; j-- ) {
				 if ( Orden.before(Mails.get(j),Mails.get(j-1)) ) {
					 // intercambiar los mensajes j y j-1 
					 
					 
				 }	 
			 }	 
		 }	
	}

}
