package ExerciciosPOO;

	public class TesteQuest1 {

		public static void main(String[] args) {
			
			Exercicio1 cliente1 = new Exercicio1();
			Exercicio1 cliente2 = new Exercicio1();
			Exercicio1 cliente3 = new Exercicio1();
			Exercicio1 cliente4 = new Exercicio1();
			Exercicio1 cliente5 = new Exercicio1();
			
			cliente1.nome = "Júlia";
			cliente1.produto = "Conjunto de roupas";
			cliente1.quantidade = 10;
			cliente1.valor= 799.99;
			
			cliente2.nome = "Talissa";
			cliente2.produto = "Fone de Ouvido Sem Fio Gamer" ;
			cliente2.quantidade = 1;
			cliente2.valor= 559.00;
			

			
			cliente1.pagarProduto();
			System.out.println("Nome: " + cliente1.nome);
			System.out.println("Produto: " + cliente1.produto);
			System.out.println("Quantidade: " + cliente1.quantidade);
			System.out.println("Valor: R$ " + cliente1.valor);
			System.out.println();
			cliente2.pagarProduto();
			System.out.println("Nome: " + cliente2.nome);
			System.out.println("Produto: " + cliente2.produto);
			System.out.println("Quantidade: " + cliente2.quantidade);
			System.out.println("Valor: R$ " + cliente2.valor);
			System.out.println();



		}




	}
}
