
public class Auxiliar extends Funcionario {
	
		public double getBonificacao() {
			System.out.println("Chamando o m�todo de bonifica��o do AUXILIAR");
		    return super.getBonificacao() + 300;
	}

	
}
