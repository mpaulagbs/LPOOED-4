import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pilha pilha = new Pilha();
		
		String pagina = "";
		int op = 0;
		
		while(true) {
			System.out.println("1 para navegar para outra página;\r\n" + 
					"2 para consultar qual a página atual;\r\n" + 
					"3 para voltar para a página anterior; ou\r\n" + 
					"4 para avançar para a próxima página.");
			op = sc.nextInt();
			sc.nextLine();
			switch(op) {
			case 1:
				System.out.println("Qual página o usuario deseja navegar?");
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
					System.out.println("Avançar pagina "+pilha.last()+" para a pagina "+pilha.returnPage());
				}
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		}
	}

}
