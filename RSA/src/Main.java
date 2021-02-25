import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// passo 1: defina dois numeros primos
		System.out.println("Digite os numeros primos p e q");
		int p = sc.nextInt();
		int q = sc.nextInt();

		// passo 2: Calculo de n
		int n = p * q;

		// passo 3: calcule z
		int z = (p - 1) * (q - 1);

		// passo 4: defina d
		int d = 7;
		// passo 5 valor de e
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int ee = 1; ee < 1000; ee++) {
			if ((ee * d) % z == 1) {
				lista.add(ee);
			}
		}

		int e = lista.get(0);

		// encriptar
		System.out.println("Qual o valor da letra que você vai criptografar?");
		int textoplano = sc.nextInt();
		int textocifrado = (int) Math.pow((textoplano), e);
		int textocifradofinal = textocifrado % n;
		System.out.println(textocifradofinal);
		// desemcriptar
		int Textoplano = (int) Math.pow((textocifrado), d);
		int Textoplanofinal = textoplano % n;
		System.out.println(Textoplanofinal);
	}
}
