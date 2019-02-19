package br.eti.webstuff.estudosjdk8;

import java.util.List;

import br.eti.webstuff.estudosjdk8.builder.PopulaLista;
import br.eti.webstuff.estudosjdk8.entidade.Perfil;

public class AppRunStreamFilterMapForEach {

	public static void main(String[] args) {
		
		
		List<Perfil> perfis = PopulaLista.populaListaTecnologias();
		
		int qtdDesenvolvedores = perfis.stream()
			  .filter(p -> p.getNivelConhecimento() > 3)
			  .filter(p -> p.getNome().equals("JDK 8"))
			  .mapToInt(Perfil::getId)
			  .sum();
		
		System.out.println("Quantidade de desenvolvedores que possui conhecimento acima de 3 pontos de 10: " + qtdDesenvolvedores);
		
		

	}

}
