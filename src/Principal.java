import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		
		BDSimulado bd = new BDSimulado();
		
		
		//retorna info do Passageiro de acordo com o nome

		System.out.println(bd.getInfoPassageiro("Wesley Rodrigues"));
		System.out.println(bd.getInfoPassageiro("Ana Ribeiro"));
		System.out.println(bd.getInfoPassageiro("Carolina Pinheiro"));
		
		//retorna quantidade de viagens de um determinado passageiro
		
		System.out.println("\nQtde de viagens do passageiro Jo�o da Silva: " + bd.getQtdeViagens("Jo�o da Silva"));
		System.out.println("\nQtde de viagens do passageiro Maria da Silva: " + bd.getQtdeViagens("Maria da Silva"));
		System.out.println("\nQtde de viagens do passageiro Jhonson Lever: " + bd.getQtdeViagens("Jhonson Lever"));
		
		//retorne o c�digo da viagem com a maior dist�ncia percorrida
		System.out.println("\nCodigo da maior distancia: " + bd.getMaiorViagem());
		
		// lista de todas as UFs onde um determinado passageiro j� realizou viagens
		ArrayList<String> listaUFsViagem = bd.getListaUFsViagem("Maria da Silva");
		
		System.out.print("\nViagens da Maria da Silva: ");
		for (int i = 0; i < listaUFsViagem.size(); i++) {
			System.out.print("/" + listaUFsViagem.get(i));
		}
		
		ArrayList<String> listaUFsViagem2 = bd.getListaUFsViagem("Jo�o da Silva");
		
		System.out.print("\nViagens da Jo�o da Silva: ");
		for (int i = 0; i < listaUFsViagem2.size(); i++) {
			System.out.print("/" + listaUFsViagem2.get(i));
		}
		
		
		// receba como entrada o nome de um passageiro e retorne o custo de cada km rodado
		System.out.println("\n\nCustos por Km da Ana Ribeiro:R$" + bd.getGastoPorKmRodado("Ana Ribeiro"));
		System.out.println("Custos por Km da Jo�o da Silva:R$" + bd.getGastoPorKmRodado("Jo�o da Silva"));
		
		
		//retorne a lista de motoqueiros que realizaram viagens em um determinado m�s e ano
		
		System.out.println(bd.getMotoqPorMesAno(4, 2016));
		System.out.println(bd.getMotoqPorMesAno(1, 2016));
		System.out.println(bd.getMotoqPorMesAno(2, 2016));
		System.out.println(bd.getMotoqPorMesAno(3, 2016));
		
		//quantidade de viagens que um determinado passageiro realizou estando fora da sua UF de origem
		
		System.out.println("\nQuantidade de viagens: " + bd.getUFsDeFora("Maria da Silva", "DF"));
		
		
		 //permita determinar a quantidade de Kms percorridos por um determinado passageiro com um determinado motoqueiro
		
		System.out.println("\nQuantidade de Kms: " + bd.getKmPorMotPassageiro("Maria da Silva", "Walleerrssonn"));
		
		
		
	}

}
