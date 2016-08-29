/**
 * 
 */
package classes;

/**
 * @author Leonardo de Lima
 *
 */
public class Funcionario {
	
	// Variaveis
	private String nome = "";
	private int idade = 0;
	private double salarioHora = 0.0;
	private int horasTrabalhadas = 0;
	
	/**
	 * Construtor com nome
	 * @param nome
	 */
	public Funcionario(String nome){
		this.nome = nome;
		this.idade = 18;
	}
	
	/**
	 * Construtor com nome e idade
	 * @param nome
	 * @param idade
	 */
	public Funcionario(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	/**
	 * Retorna o nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Atribui o nome
	 * @param nome
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna a idade
	 * @return idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * Atribui a idade
	 * @param idade
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * Retorna o salário/h
	 * @return salarioHora
	 */
	public double getSalarioHora() {
		return salarioHora;
	}

	/**
	 * Atribui o sálario/h
	 * @param salarioHora
	 */
	public void setSalarioHora(double salarioHora) {
		if (salarioHora >= 10 && salarioHora <= 200){
		this.salarioHora = salarioHora;
		}else{
			System.out.println("O salário/h deve estar entre 100 e 200!");
		}
	}

	/**
	 * Retorna horas trabalhadas
	 * @return horasTrabalhadas
	 */
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	/**
	 * Atribui as horas trabalhadas
	 * @param horasTrabalhadas
	 */
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		if (horasTrabalhadas >= 0 && horasTrabalhadas < 160){
		this.horasTrabalhadas = horasTrabalhadas;
		}else{
			System.out.println("Horas trabalhadas não pode ser menor que 0 ou maior que 160!");
		}
	}
	
	/**
	 * Atribui o salário e horas trabalhadas
	 * @param salarioHora
	 * @param horasTrabalhadas
	 */
	public void setSalarioHoraEHorasTrabalhadas(double salarioHora, int horasTrabalhadas){
		this.salarioHora = salarioHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	/**
	 * Mostra todos os dados
	 * @return dados
	 */
	public String mostrarDados(){
		String dados = String.format("Nome: %s, Idade: %d, Salario/h: %2.2f, Horas Trabalhadas: %d, "
				+ "Salario Total: %2.2f", nome, idade, salarioHora, horasTrabalhadas, calcularSalario());
		return dados;
	}
	
	/**
	 * Calcula o salário do funcionário
	 */
	public double calcularSalario(){
		double salario = 0.0;
		salario = (salarioHora * horasTrabalhadas);
		return salario;
	}
}