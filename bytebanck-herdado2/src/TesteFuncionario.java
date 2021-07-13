
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario ulysses = new Funcionario();
		ulysses.setNome("Ulyses Serra");
		ulysses.setCpf("848.106.612-53");
		ulysses.setSalario(2280.00);
		
		System.out.println(ulysses.getNome());
		System.out.println(ulysses.getBonificacao());

	}

}
