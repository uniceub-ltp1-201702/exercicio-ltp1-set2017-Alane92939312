
public class Viagem {

		private int codigo;
		private int mes;
		private int ano;
		private Passageiro passageiro;
		private String motoqueiro;
		private double distancia;
		private double valor;
		private String cidade;
		private String UF;
		
		
		// metodo construtor
		public Viagem(int codigo, int ano, int mes, Passageiro passageiro, String motoqueiro, Double distancia,
				Double valor, String cidade, String UF) {
			super();
			this.codigo = codigo;
			this.mes = mes;
			this.ano = ano;
			this.passageiro = passageiro;
			this.motoqueiro = motoqueiro;
			this.distancia = distancia;
			this.valor = valor;
			this.cidade = cidade;
			this.UF = UF;
			
		}
		//gets sets
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public int getMes() {
			return mes;
		}
		public void setMes(int mes) {
			this.mes = mes;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public Passageiro getPassageiro() {
			return passageiro;
		}
		public void setPassageiro(Passageiro passageiro) {
			this.passageiro = passageiro;
		}
		public String getMotoqueiro() {
			return motoqueiro;
		}
		public void setMotoqueiro(String motoqueiro) {
			this.motoqueiro = motoqueiro;
		}
		public Double getDistancia() {
			return distancia;
		}
		public void setDistancia(Double distancia) {
			this.distancia = distancia;
		}
		public Double getValor() {
			return valor;
		}
		public void setValor(Double valor) {
			this.valor = valor;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getUF() {
			return UF;
		}
		public void setUF(String UF) {
			this.UF = UF;
		}
	
	
		
		
	
}
