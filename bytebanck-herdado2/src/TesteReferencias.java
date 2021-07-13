
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setNome("Ulysses Serra");
		g1.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		Funcionario dev = new Desenvolvedor();
		dev.setSalario(2500.0);
		
		Funcionario an = new Analista();
		an.setSalario(2800.0);
		
		Funcionario sp = new Suporte();
		sp.setSalario(2280.0);
		
		Designer ds = new Designer();
		ds.setSalario(2600.0);
		
		Assistente as = new Assistente();
		as.setSalario(1600.0);
		
		Auxiliar ax = new Auxiliar();
		ax.setSalario(1100.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(dev);
		controle.registra(an);
		controle.registra(sp);
		controle.registra(ds);
		controle.registra(as);
		controle.registra(ax);
		
		System.out.println(controle.getSoma());
	}

}
