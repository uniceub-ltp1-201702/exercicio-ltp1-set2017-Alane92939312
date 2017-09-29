import java.util.ArrayList;
public class BDSimulado {

	
	 private ArrayList<Passageiro> passageiros;
	    private ArrayList<Viagem> viagens;
	     
	    public BDSimulado(){
	        //Instanciando as listas
	        this.passageiros = new ArrayList<Passageiro>();
	        this.viagens = new ArrayList<Viagem>();
	         
	        //Criando passageiros
	        Passageiro p1 = new Passageiro("Maria da Silva", 46, "Brasília", "DF");
	        Passageiro p2 = new Passageiro("Ricardo Andrade", 32, "Brasília", "DF");
	        Passageiro p3 = new Passageiro("Carolina Pinheiro", 27, "Brasília", "DF");
	        Passageiro p4 = new Passageiro("Jhonson Lever", 26, "Brasília", "DF");
	        Passageiro p5 = new Passageiro("Cássia Luiza", 15, "São Paulo", "SP");
	        Passageiro p6 = new Passageiro("Wesley Rodrigues", 38, "São Paulo", "SP");
	        Passageiro p7 = new Passageiro("Josefina Souza", 25, "São Paulo", "SP");
	        Passageiro p8 = new Passageiro("Josué Fernandes", 55, "Rio de Janeiro", "RJ");
	        Passageiro p9 = new Passageiro("Ana Ribeiro", 20, "Rio de Janeiro", "RJ");
	        Passageiro p10 = new Passageiro("João da Silva", 22, "Rio de Janeiro", "RJ");
	 
	        //Adicionando passageiros
	        this.passageiros.add(p1);
	        this.passageiros.add(p2);
	        this.passageiros.add(p3);
	        this.passageiros.add(p4);
	        this.passageiros.add(p5);
	        this.passageiros.add(p6);
	        this.passageiros.add(p7);
	        this.passageiros.add(p8);
	        this.passageiros.add(p9);
	        this.passageiros.add(p10);
	         
	        //Criando viagens
	        Viagem v1 = new Viagem(1, 2016, 1, p1, "Walleerrssonn", 10.0, 2.50, "Brasília", "DF");
	        Viagem v2 = new Viagem(2, 2016, 1, p10, "Walleerrssonn", 100.0, 22.45, "Brasília", "DF");
	        Viagem v3 = new Viagem(3, 2016, 1, p1, "Walleerrssonn", 12.0, 3.00, "Brasília", "DF");
	        Viagem v4 = new Viagem(4, 2016, 4, p4, "Joãozinho", 120.12, 33.50, "São Paulo", "SP");
	        Viagem v5 = new Viagem(5, 2016, 2, p1, "Joãozinho", 237.0, 67.20, "São Paulo", "SP");
	        Viagem v6 = new Viagem(6, 2016, 2, p7, "Joãozinho", 121.0, 24.80, "São Paulo", "SP");
	        Viagem v7 = new Viagem(7, 2016, 3, p9, "Mariazinha", 463.89, 129.00, "Rio de Janeiro", "RJ");
	        Viagem v8 = new Viagem(8, 2016, 3, p10, "Mariazinha", 5.0, 1.50, "Rio de Janeiro", "RJ");
	        Viagem v9 = new Viagem(9, 2016, 3, p1, "Pedrinho", 35.76, 19.10, "São Paulo", "SP");
	        Viagem v10 = new Viagem(10, 2016, 5, p3, "Pedrinho", 14.23, 7.90, "São Paulo", "SP");
	         
	        //Adicionando viagens
	        this.viagens.add(v1);
	        this.viagens.add(v2);
	        this.viagens.add(v3);
	        this.viagens.add(v4);
	        this.viagens.add(v5);
	        this.viagens.add(v6);
	        this.viagens.add(v7);
	        this.viagens.add(v8);
	        this.viagens.add(v9);
	        this.viagens.add(v10);
	    }
	 
	  //Metodo que retorna info do Passageiro de acordo com o nome
		public String getInfoPassageiro(String nome){
			String resultado = "";
			
			//Percorrer a lista de ONGs buscando pelo nome
			for (int i = 0; i < this.passageiros.size(); i++) {
				if (this.passageiros.get(i).getNome().equals(nome)) {
					resultado = "\nNome: " + this.passageiros.get(i).getNome()
							+ "\n" +
							"Idade: " + this.passageiros.get(i).getIdade()
							+ "\n" +
						    "Cidade: " + this.passageiros.get(i).getCidade()
						    + "\n" +
						    "UF: " + this.passageiros.get(i).getUF();
				}
			}
			
			return resultado;
		}
		
		//metodo que retorna quantidade de viagens de um determinado passageiro
		public int getQtdeViagens(String passageiros){
			int resultado = 0;
			// pecorre a lista de viagens
			for (int i = 0; i < this.viagens.size(); i++) {
				if(this.viagens.get(i).getPassageiro().getNome().equals(passageiros)){
					resultado++;
				}
				
			}
			
			return resultado;
			
		}
	    
		//metodo que retorne o código da viagem com a maior distância percorrida
		
		public int getMaiorViagem(){
			int resultado = 0;
			double distancia = 0;
			
			// pecorre a lista de viagens
			for (int i = 0; i < this.viagens.size(); i++) {
				//comparando a distancia para dar o codigo na maior
				if(this.viagens.get(i).getDistancia()> distancia){
					distancia = this.viagens.get(i).getDistancia();
					resultado = this.viagens.get(i).getCodigo();
				}
			
			}
			return resultado;
		}
		
		// lista de todas as UFs onde um determinado passageiro já realizou viagens
		public ArrayList<String> getListaUFsViagem(String passageiros){
			ArrayList<String> resultado = new ArrayList<String>();
			//pecorre a lista de viagens
			for (int i = 0; i < this.viagens.size(); i++) {
				if (this.viagens.get(i).getPassageiro().getNome().equals(passageiros) ) {
					resultado.add(this.viagens.get(i).getUF());
				}
				}
		
			return resultado;
			
		}
					
		//metodo que receba como entrada o nome de um passageiro e retorne o custo de cada km rodado
		public double getGastoPorKmRodado(String passageiros){
			double resultado = 0;
			for (int i = 0; i < this.viagens.size(); i++) {
				if(this.viagens.get(i).getPassageiro().getNome().equals(passageiros)){
					resultado = this.viagens.get(i).getValor()/this.viagens.get(i).getDistancia();
					
				}
			}
			return resultado;
		}
		
		//Metodo retorne a lista de motoqueiros que realizaram viagens em um determinado mês e ano
		public String getMotoqPorMesAno(int mes, int ano){
			String resultado = "";
			
			//Percorrer a lista de viagem
			for (int i = 0; i < this.viagens.size(); i++) {
				if (this.viagens.get(i).getMes() == mes && this.viagens.get(i).getAno() == ano) {
					resultado = "\nMotoqueiro: " + this.viagens.get(i).getMotoqueiro();
				}
			}
		
			return resultado;
		}
		
			//determinar a quantidade de viagens que um determinado passageiro realizou estando fora da sua UF de origem
			public int getUFsDeFora(String passageiro, String UF){
				int resultado = 0;
				// pecorrer a lista de viagens
				for (int i = 0; i < this.viagens.size(); i++) {
					if(this.viagens.get(i).getPassageiro().getNome().equals(passageiro)&& this.viagens.get(i).getUF()!= UF){
						resultado ++;
					}
				}
			
				return resultado;
		}
			
	    //permita determinar a quantidade de Kms percorridos por um determinado passageiro com um determinado motoqueiro
			public double getKmPorMotPassageiro(String passageiros, String motoqueiros){
				double resultado = 0;
				for (int i = 0; i < this.viagens.size(); i++) {
					if(this.viagens.get(i).getPassageiro().getNome().equals(passageiros)&& 
							(this.viagens.get(i).getMotoqueiro().equals(motoqueiros))){
						resultado = resultado + this.viagens.get(i).getDistancia();
					}
				}
				
				return resultado;
				
			}
			
			
			
			
			
	    public ArrayList<Passageiro> getPassageiros() {
	        return passageiros;
	    }
	 
	    public ArrayList<Viagem> getViagens() {
	        return viagens;
	    }
	
	    
	    
	    
	    
	    
}
