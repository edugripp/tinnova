package eleitores;

public class Eleicao {
	
	private int totalEleitores;
	
	private int votosValidos;
	
	private int votosBrancos;
	
	private int votosNulos;
	
	

	public Eleicao(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
		this.totalEleitores = totalEleitores;
		this.votosValidos = votosValidos;
		this.votosBrancos = votosBrancos;
		this.votosNulos = votosNulos;
	}

	public int getTotalEleitores() {
		return totalEleitores;
	}

	public void setTotalEleitores(int totalEleitores) {
		this.totalEleitores = totalEleitores;
	}

	public int getVotosValidos() {
		return votosValidos;
	}

	public void setVotosValidos(int votosValidos) {
		this.votosValidos = votosValidos;
	}

	public int getVotosBrancos() {
		return votosBrancos;
	}

	public void setVotosBrancos(int votosBrancos) {
		this.votosBrancos = votosBrancos;
	}

	public int getVotosNulos() {
		return votosNulos;
	}

	public void setVotosNulos(int votosNulos) {
		this.votosNulos = votosNulos;
	}
	
//	para evitar problemas poderiamos colocar a divisao em um try catch para evitar erros caso tenham colocado total de eleitores como 0.
	

	public double percentualVotosValidosPorTotalEleitores() {
		return (100.0*this.getVotosValidos() / this.getTotalEleitores());
	}
	
	public double percentualVotosBrancosPorTotalEleitores() {
		return (100.0*this.getVotosBrancos() / this.getTotalEleitores());
	}
	
	public double percentualVotosNulosPorTotalEleitores() {
		return (100.0*this.getVotosNulos() / this.getTotalEleitores());
	}
	
	

}
