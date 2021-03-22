package ordenacao;

public class OrdenacaoMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = {5,3,2,4,7,1,0,6};
		
		System.out.print("Vetor: ");
		imprimeVetor(v);
		ordenaVetor(v);
		System.out.print("Vetor ordenado: ");
		imprimeVetor(v);
		
		
	}
	
	static void ordenaVetor(int v[]) {
//		repeticao da ordenacao n - 1 vezes
		for(int i = 0; i<v.length-1; i++) {
			
//			como sempre pegamos j e j+1, deve rodar até n-1-i que é o numero de vezes que ja passamos pela ordenacao 
			for(int j = 0; j<v.length-i-1; j++) {
				
				if(v[j]>v[j+1]) {
					int aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
				
			}
		}
	}
	
	static void imprimeVetor(int v[]) {
		String s = "{ ";
		for(int i=0; i<v.length;i++) {
			s = s + v[i];
			if(i<v.length-1) {
				s = s + ", ";
			}
		}
		s = s + "}";
		System.out.println(s);
	}
}
