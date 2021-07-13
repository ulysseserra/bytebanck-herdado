
public class Assistente extends Funcionario implements Autenticavel {
	
		public double getBonificacao() {
			System.out.println("Chamando o método de bonificação do ASSISTENTE");
		    return super.getSalario();
	}
		
        private int senha;
		
		@Override
		public void setSenha(int senha) {
			this.senha = senha;
		}

		@Override
		public boolean autentica(int senha) {
			if (this.senha == senha) {
				return true;
			} else {
			return false;
		    }
			
	    }	
		

	
}
