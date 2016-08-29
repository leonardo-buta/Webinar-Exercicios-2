/**
 * 
 */
package classes;

/**
 * @author Leonardo
 *
 */
public class Analista extends Funcionario{

	// Variaveis
	private String setor = "";

	/**
	 * Construtor com nome
	 * @param nome
	 */
	public Analista(String nome) {
		super(nome);
	}
	
	/**
	 * Construtor com nome e idade
	 * @param nome
	 * @param idade
	 */
	public Analista(String nome, int idade){
		super(nome, idade);
	}
	
	/**
	 * Retorna o setor
	 * @return setor
	 */
	public String getSetor() {
		return setor;
	}

	/**
	 * Atribui o setor
	 * @param setor
	 */
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	/**
	 * Mostra todos os dados
	 * @return dados
	 */
	@Override
	public String mostrarDados(){
		String dados = String.format("Nome: %s, Idade: %d, Salario/h: %2.2f, Horas Trabalhadas: %d, "
				+ "Setor: %s, Salario Total: %2.2f",
			this.getNome(), this.getIdade(), this.getSalarioHora(), this.getHorasTrabalhadas(),
			this.getSetor(), this.calcularSalario());
		return dados;		
	}
}