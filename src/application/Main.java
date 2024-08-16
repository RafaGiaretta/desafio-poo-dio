package application;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main (String[] args) {
		
		Conteudo curso1 = new Curso("Curso JAVA", "Descricao Curso Java", 8);
		Conteudo curso2 = new Curso("Curso JS", "Descricao Curso JS", 4);
		
		Conteudo mentoria1 = new Mentoria("Mentoria JAVA", "Descricao Mentoria JAVA", LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria1);
	}
}
