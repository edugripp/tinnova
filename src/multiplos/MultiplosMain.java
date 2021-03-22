package multiplos;

public class MultiplosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroParaObterASoma = 10;
		System.out.println("A soma dos multiplos de 3 e 5 abaixo de " + numeroParaObterASoma + " é " + somaMultiplos3Ou5(numeroParaObterASoma));
	}
	
	static int somaMultiplos3Ou5(int n) {
		int soma = 0;
		for(int i=1; i<n; i++) {
			if(i%3 ==0 || i%5 ==0) {
				soma = soma + i;
			}
		}
		return soma;
	}

}
