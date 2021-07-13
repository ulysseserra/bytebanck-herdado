
public class ControleBonificacao {
	
	private double soma;
	
//	public void registra(Gerente g) {	
//		double boni = g.getBonificacao();
//		this.soma = this.soma + boni;
//	}
	
	public void registra(Funcionario f) {	
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;	
	}
	
//	public void registra(Desenvolvedor dev) {	
//		double boni = dev.getBonificacao();
//		this.soma = this.soma + boni;	
//	}
//	
//	public void registra(Analista an) {	
//		double boni = an.getBonificacao();
//		this.soma = this.soma + boni;
//	}
//	
//	public void registra(Suporte sp) {	
//		double boni = sp.getBonificacao();
//		this.soma = this.soma + boni;
//	}
//	
	public double getSoma() {
		return soma;
	}
	

}
