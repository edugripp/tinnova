package fatorial;

public class FatorialMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maiorValorFatorial = 10;
		for(int i=0;i<=maiorValorFatorial; i++) {
			System.out.println("O fatorial de " + i + " é " + fatorial(i));
		}
		
	}
	
	static int fatorial(int n) {
		if(n == 0 || n ==1) {
			return 1;
		}
//		utilizacao de recursividade para chegar no valor do fatorial
		else if(n > 1) {
			return n * fatorial(n-1);
		}
		else {
			throw new ArithmeticException(n +" é um número inválido para o fatorial");
		}
	}

}
