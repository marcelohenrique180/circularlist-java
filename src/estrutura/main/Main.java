package estrutura.main;

import java.util.Scanner;

import estrutura.listacircular.dupla.DListaCircular;
import estrutura.listacircular.dupla.DListaCircularImpl;
import estrutura.node.DNode;

public class Main {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		DListaCircular<Integer> listaCircular = new DListaCircularImpl<>();
		int totalPessoas, jump;
		
		System.out.print("Insira o total de pessoas: ");
		totalPessoas = scanner.nextInt();
		System.out.print("Insira o intervalo entre tiros: ");
		jump = scanner.nextInt();
		
		for (int i=totalPessoas; i > 0; i--){
			listaCircular.add(new DNode<Integer>(i, null, null));
		}
		
		jump = jump - 1;
		int temp = 1;
		listaCircular.advance();
		System.out.println(listaCircular);
		
		while (listaCircular.getSize() > 1) {
			if (temp == jump) {
				DNode<Integer> morto = listaCircular.remove();
				System.out.println("A pessoa da posicao "+morto.getElement() + " morreu.");
				temp=0;
			}
			System.out.println(listaCircular);
			temp++;
			listaCircular.advance();
		}
		
		System.out.println("Houve "+listaCircular.getSize()+" sobrevivente.");
		System.out.println("Sua posição era: "+listaCircular.getCursor().getElement());
		
		scanner.close();
	}
}
