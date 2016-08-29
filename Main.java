/**
 * 
 */
package classes;

/**
 * @author Leonardo de Lima
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Cria as inst�ncias e atribui valores atrav�s dos m�todos setters
		
		// Inst�ncia do Funcionario
		Funcionario funcionario = new Funcionario("Leonardo", 20);
		funcionario.setSalarioHoraEHorasTrabalhadas(1.0,100);
		
		// Inst�ncia do analista
		Analista analista = new Analista("Leonardo", 20);
		analista.setSalarioHoraEHorasTrabalhadas(1.0, 100);
		analista.setSetor("T.I");
		
		// Inst�ncia do Gerente
		Gerente gerente = new Gerente("Leonardo", 20);
		gerente.setSalarioHoraEHorasTrabalhadas(1.00, 100);
		gerente.setBonus(100.0);
		gerente.mostrarDados();		
		
		// Mostra os dados de cada inst�ncia
		System.out.println(funcionario.mostrarDados());
		System.out.println(analista.mostrarDados());
		System.out.println(gerente.mostrarDados());
		
		// Cria um novo Funcionario pela classe empresa
		// 1 - Gerente e 2 - Analista
		System.out.println(Empresa.criarFuncionario(1, "Leonardo", 20).mostrarDados());
		System.out.println(Empresa.criarFuncionario(2, "Leonardo", 20).mostrarDados());
	}
}