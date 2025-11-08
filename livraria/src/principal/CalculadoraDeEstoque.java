package principal;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		
//--------- continue e Break---------------//
		
		for (int i = 0; i <=10; i++ ) {
			if(i == 7) {
				continue;
			}
			System.out.println(i);
		}
		for (int i = 0; i <=10; i++ ) {
			if(i == 7) {
				break;
			}
			System.out.println(i);
		}
		
//----------Operador lógico em expressão boelana------------//
		
		/*if (v1 > v2 && v2 < v3 ) {
		
		}*/	
		
		/*boolean condicao = 1.0;
		
		if(!condicao) {
			System.out.print(condicao);
		}*/
//==========================================//
//-----------LIVRARIA---------------------//
//==========================================//
		double soma = 0;
		
		for (double i =0; i < 35; i ++) {
			soma += 59.90;
		}
		
	//---exercitando estrutura while----//
		/*while (contador < 35) {
			double valorDoLivro = 59.90;
			soma += valorDoLivro;
			contador ++;
		}*/
		
		System.out.println("A soma dos livros em estoque é: " + soma);
		if (soma <150) {
			System.out.println("O Estoque esta muito baixo");
			} else if (soma >= 2000) {
				System.out.println("O Estoque esta muito alto");			
			} else {
			System.out.println("O Estoque esta bom");
		}
	
	}
}

//---------------FIM LIVRARIA-------------------------//
//====================================================//

//--------------estando a guara de valores em variaveis tipo primitivo----//

		//int numero = 4;
		// int outroNumeroIgual = numero;
		// numero = numero + 5;
		 
		// System.out.println(numero);
		// System.out.println(outroNumeroIgual);
		 
//-------testando variaveis do tipo nao primitivo----------------------//
		 
		// String texto = "Eu sou uma String";
		//System.out.println(texto);
		 
//------casting de valores (forcar a conversao de tipo de dados)----//
		
		//livroJava8 = 60;
		//int numeroInteiro = (int)livroJava8;
		
		
		
				 


//----------------Tipos de Operadores------------------------//

// double subtracao = livroJava8 - livroTDD;
// double multiplicao = livroJava8 * livroTDD;
// double divisao = livroJava8 / livroTDD;
// double modulo = livroJava8 % livroTD0D;


//--------------Tipos Primitivos para representar tipos inteiros-------------//
/*	byte inteiro1 = 10
	short inteiro2 = 10;
	int inteiro3 = 10;
	long inteiro4 = 10
*/

//------*Diferencas de tamanho em cada tipo de variavel-----//
 /** boolean tem 1bit
 * byte tem 1 bit
 * short tem 2byte
 * char tem 2 byte
 * int tem 4 byte
 * float tem 4 byte
 * long tem 8 byte
 * double tem 8 byte
 */
 /**/


//--------------------------------CRIANDO UMA NOVA CLASSE LIVRO-----------------------------------------///


