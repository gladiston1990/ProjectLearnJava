package principal;

public class Livro {
	
		String nome;
		String descricao;
		double valor;
		String isbn;
		
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome = "Java 8 Prático";
		livro.descricao = "Novos recursos";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";
		
		System.out.println("O nome do livor é :" + livro.nome);
		
		}
}

