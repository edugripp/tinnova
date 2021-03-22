package eleitores;

public class MainEleicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eleicao eleicao = new Eleicao(1000,800,150,50);
		
		System.out.println("percentual de votos validos é " + eleicao.percentualVotosValidosPorTotalEleitores() + "%");
		System.out.println("percentual de votos brancos é " + eleicao.percentualVotosBrancosPorTotalEleitores() + "%");
		System.out.println("percentual de votos nulos é " + eleicao.percentualVotosNulosPorTotalEleitores() + "%");
	}

}
