
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setNome("Ulysses Serra");
		g1.setSalario(5000.0);
		
		Funcionario f = new Gerente();
		f.setSalario(2000.0);
		
		Funcionario dev = new Desenvolvedor();
		dev.setSalario(2500.0);
		
		Funcionario an = new Analista();
		an.setSalario(2800.0);
		
		Suporte sp = new Suporte();
		sp.setSalario(2280.0);
		
		Designer ds = new Designer();
		ds.setSalario(2600.0);
		
		Assistente as = new Assistente();
		as.setSalario(1600.0);
		
		Auxiliar ax = new Auxiliar();
		ax.setSalario(1100.0);
		
		Diretor dr = new Diretor();
		dr.setSalario(5000.0);
		
		Coordenador coo = new Coordenador();
		coo.setSalario(2900.0);
		
		Estagiario et = new Estagiario();
		et.setSalario(1000.0);
		
		Especialista ep = new Especialista();
		ep.setSalario(5200.0);
	

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(dev);
		controle.registra(an);
		controle.registra(sp);
		controle.registra(ds);
		controle.registra(as);
		controle.registra(ax);
		controle.registra(dr);
		controle.registra(coo);
		controle.registra(et);
		controle.registra(ep);
		
		System.out.println(controle.getSoma());
	}

}
