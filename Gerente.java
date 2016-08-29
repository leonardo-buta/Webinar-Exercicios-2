/**
 * 
 */
package classes;

/**
 * @author Leonardo de Lima
 *
 */
public class Gerente extends Funcionario{

	// Variaveis
	private double bonus = 0.0;
	
	/**
	 * Construtor com nome
	 * @param nome
	 */
	public Gerente(String nome){
		super(nome);
	}
	
	/**
	 * Construtor com nome e idade
	 * @param nome
	 * @param idade
	 */
	public Gerente(String nome, int idade){
		super(nome, idade);
	}

	/**
	 * Retorna o bonus
	 * @return bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * Atribui o bonus
	 * @param bonus
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	/**
	 * Calcula o salário do funcionário
	 * @return salario
	 */
	public double calcularSalario(){
		double salario = 0.0;
		salario = ((this.getSalarioHora() * this.getHorasTrabalhadas()) + bonus);
		return salario;
	}
	
	/**
	 * Mostra todos os dados
	 * @return dados
	 */
	@Override
	public String mostrarDados(){
		String dados = String.format("Nome: %s, Idade: %d, Salario/h: %2.2f, Horas Trabalhadas: %d, "
				+ "Bonus: %2.2f, Salário Total: %2.2f",
			this.getNome(), this.getIdade(), this.getSalarioHora(), this.getHorasTrabalhadas(), this.getBonus(),
			this.calcularSalario());
		return dados;		
	}
}