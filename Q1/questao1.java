import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Fila line = new Fila();
		
		String nome = "";
		int op = 0;
		
		while(true) {
			System.out.println("1 para incluir um cliente na fila;\r\n" + 
					"2 para atender o próximo cliente;\r\n" + 
					"3 para consultar o próximo cliente da fila; ou\r\n" + 
					"4 para consultar quantos clientes existem na fila.");
			op = sc.nextInt();
			sc.nextLine();
			switch(op) {
			case 1:
				System.out.println("Digite o nome do cliente.");
				nome = sc.nextLine();
				line.line(nome);
				break;
			case 2:
				if(line.isEmpty()) {
					System.out.println("Não há clientes na fila");
				} else {
					System.out.println("Cliente "+line.dline()+" atendido");
				}
				break;
			case 3:
				if(line.isEmpty()) {
					System.out.println("Não há clientes na fila");
				} else {
					System.out.println("O cliente "+line.front()+" é o proximo");
				}
				break;
			case 4:
				System.out.println(line.size()+" clientes aguardando na fila");
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		}
	}
}
