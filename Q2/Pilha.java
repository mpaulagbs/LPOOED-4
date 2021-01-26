
public class Pilha {

	public int trashPont;
	public int pilhaPont;
	public String[] vt;
	public String[] ts;
	
	public Pilha() {
		
		this.trashPont = 0;
		this.pilhaPont = 0;
		this.vt = new String[100];
		this.ts = new String[1000];
	}

	public int size() {
		
		if (this.isEmpty()) {
			return 0;
			
		}
		return this.pilhaPont;
	}
	
	public boolean isEmpty() {
		
		if (this.pilhaPont == 0) {
			return true;
			
		}
		return false;
	}


	public String last() {
		
		if (isEmpty()) {
			return null;
			
		}
		return this.vt[this.pilhaPont-1];
	}

	public String pop() {
		if (isEmpty()) {
			return null;
		}
		this.ts[this.trashPont] = this.vt[this.pilhaPont-1];
		this.trashPont++;
		String valor = this.vt[this.pilhaPont-1];
		this.pilhaPont--;
		return valor;
	}
	
	public String returnPage() {
		if(this.trashPont ==0 ) {
			return "Página em branco";
		}
		push(this.ts[this.trashPont-1]);
		this.trashPont--;
		return last();
	}
	
	public void push(String valor) {
		
		if (this.pilhaPont < vt.length) {
			this.vt[this.pilhaPont] = valor;
			this.pilhaPont++;
		}
	}
}
