
public class Suporte extends Funcionario {
	
		public double getBonificacao() {
			System.out.println("Chamando o m�todo de bonifica��o do SUPORTE");
		    return super.getBonificacao() + 400;
	}

	
}
