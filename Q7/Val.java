
public class Val {

	private String value;
	private Val next;
	
	public Val getProximo() {
		return this.next;
	}

	public void setProximo(Val proximo) {
		this.next = proximo;
	}
	
	public String getValor() {
		return this.value;
	}

	public void setValor(String valor) {
		this.value = valor;
	}

}
