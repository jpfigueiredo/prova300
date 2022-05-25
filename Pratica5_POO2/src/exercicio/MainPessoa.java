package exercicio;

public class MainPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Criando objetos (sempre deve ser realizado na classe main)
		
		pessoa pessoa1 = new pessoa("Roberto",1.70,60);
		pessoa pessoa2 = new pessoa("João",1.80,80);
		
		
		//criando array de 10 posições
		
		pessoa[] pessoas = new pessoa[10];
		for (int i=0;i<10;i++) {
			
			pessoas[i] = new pessoa("Maria"+i,50,1.70);
			
		}
	}

}

