
public class Suporte extends Funcionario {
	
		public double getBonificacao() {
			System.out.println("Chamando o método de bonificação do SUPORTE");
		    return super.getBonificacao() + 400;
	}

	
}
