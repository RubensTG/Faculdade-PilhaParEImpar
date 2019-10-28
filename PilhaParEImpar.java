package testes;

public class PilhaParEImpar {
	public static void main(String[] args) {

		int pegaNumeros[] = {15, 20, 30, 44, 55, 68, 77, 81, 93, 10 };
		int pilhaPar[] = new int[10];
		int pilhaImpar[] = new int[10];
		int j2 = 0;
		int j = 0;

		for (int i = 0; i < pegaNumeros.length; i++) {
			if (pegaNumeros[i] % 2 == 0) {
				pilhaPar[j] = pegaNumeros[i];
				j++;
			} else {
				pilhaImpar[j2] = pegaNumeros[i];
				j2++;
			}
		}
		System.out.println("Pilha Par:");
		for (int j3 = 0; j3 < pegaNumeros.length; j3++) {
			if(pilhaPar[j3] == 0) {

			}else {
			System.out.println(pilhaPar[j3]);
			}
		}
		System.out.println("Pilha Impar:");
		for (int j4 = 0; j4 < pegaNumeros.length; j4++) {
			if(pilhaImpar[j4] == 0) {

			}else {
			System.out.println(pilhaImpar[j4]);
			}
		}
	}

}
