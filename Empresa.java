/**
 * 
 */
package classes;

/**
 * @author Leonardo de Lima
 *
 */
public class Empresa {

	// Variaveis
	private static final int gerente = 1;
	private static final int analista = 2;
	private static Funcionario funcionario = null;
	
	/**
	 * Construtor padr�o
	 */
	public Empresa(){
	}
	
	/**
	 * M�todo est�tico que retorna uma inst�ncia de funcionario
	 * @param tipoFuncionario - 1 para gerente e 2 para analista
	 * @param nome
	 * @param idade
	 * @return funcionario
	 */
	public static Funcionario criarFuncionario(int tipoFuncionario, String nome, int idade){
		
		switch (tipoFuncionario){
		
		case gerente:
			funcionario = new Gerente(nome, idade);
			break;
			
		case analista:
			funcionario = new Analista(nome, idade);
			break;
			
			default:
				System.out.println("Op��o inv�lida!");
		}		
		return funcionario;		
	}
}