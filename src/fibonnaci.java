
/**
 * @author uires
 *
 */

public class fibonnaci {
	
	static void imprime(int numero){
		
		int atual = 0;
		int anterior = 0;
		
		for (int i = 0; i < numero; i++) {
			if(i == 1){
				atual = 1;
				anterior = 0;
			} else {
				atual += anterior;
				anterior = atual - anterior;
			}
			System.out.print(atual + " ");
		}
	}
	
	static int imprimeRecursivo(int numero){
		if(numero <= 1){
			return numero;
		} else {
			return imprimeRecursivo(numero -1)+imprimeRecursivo(numero-2);
		}
	}
	
	public static void main(String[] args) {
		//imprime(45);
		
		System.out.println(imprimeRecursivo(5));
	}
	
}
