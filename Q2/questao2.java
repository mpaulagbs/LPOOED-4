import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pilha pilha = new Pilha();
		
		String pagina = "";
		int op = 0;
		
		while(true) {
			System.out.println("1 para navegar para outra p�gina;\r\n" + 
					"2 para consultar qual a p�gina atual;\r\n" + 
					"3 para voltar para a p�gina anterior; ou\r\n" + 
					"4 para avan�ar para a pr�xima p�gina.");
			op = sc.nextInt();
			sc.nextLine();
			switch(op) {
			case 1:
				System.out.println("Qual p�gina o usuario deseja navegar?");
				pagina = sc.nextLine();
				pilha.push(pagina);
				break;
			case 2:
				if(pilha.isEmpty()) {
					System.out.println("Pagina em branco");
				} else {
					System.out.println("Pagina atual: "+ pilha.last());
				}
				break;
			case 3:
				if(pilha.isEmpty()) {
					System.out.println("Pagina em branco");
				} else {
					
					System.out.println("Voltando da pagina "+pilha.pop()+" para a pagina "+pilha.last());
				}
				break;
			case 4:
				if(pilha.isEmpty()) {
					System.out.println("Pagina em branco");
				} else {
					System.out.println("Avan�ar pagina "+pilha.last()+" para a pagina "+pilha.returnPage());
				}
				break;
			default:
				System.out.println("Op��o invalida");
				break;
			}
		}
	}

}
