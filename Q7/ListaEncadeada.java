
public class ListaEncadeada {

	private Val base;

	public void push(String value) {
		
		Val nv = new Val();
		nv.setValor(value);
		nv.setProximo(null);
		
		if (base == null) { 
			base = nv;
			
		} else { 
			Val topo = encontrarUltimo();
			topo.setProximo(nv);
		}
	}

	private Val encontrarUltimo() {
	
		Val aux = base;
		while (aux.getProximo() != null) {
			aux = aux.getProximo();
		}
		return aux;
	}

	public String pop() {
		
		if (base == null) {
			throw new NullPointerException("Pilha vazia");
		}
			
		String valor;
		
		if (base.getProximo() == null) { 
			valor = base.getValor();
			base = null;
		
		} else { 
			Val penul = encontrarPenul();
			valor = penul.getProximo().getValor();
			penul.setProximo(null);
		}
		return valor;
	}

	private Val encontrarPenul() {
		Val aux = base;
		while (aux.getProximo().getProximo() != null) {
			aux = aux.getProximo();
		}
		return aux;
	}
	
}
