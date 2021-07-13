
public class Desenvolvedor extends Funcionario {
	
		public double getBonificacao() {
			System.out.println("Chamando o método de bonificação do DESENVOLVER");
		    return super.getBonificacao() + 100;
	}

	
}
