
public class Auxiliar extends Funcionario {
	
		public double getBonificacao() {
			System.out.println("Chamando o método de bonificação do AUXILIAR");
		    return super.getBonificacao() + 300;
	}

	
}
