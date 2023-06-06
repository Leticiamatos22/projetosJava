package orientacaoObjetos;

public class Principal {

	public static void main(String[] args) {
		Livro livro = new Livro(); //criei e instanciei um objeto e atribui valores para os atributos do livro criada na outra classe
		
		livro.nome = "Crepúsculo";
		livro.descricao = "Livro de romance";
		livro.isbn = "123456789";
		livro.preco = 49.95;
		livro.autor = "Leticia Matos";
		livro.dataPub = "20/04/2018";
		
		
		livro.dadosLivro(); // exibi as informaçoes estabelecidas

	}

}
