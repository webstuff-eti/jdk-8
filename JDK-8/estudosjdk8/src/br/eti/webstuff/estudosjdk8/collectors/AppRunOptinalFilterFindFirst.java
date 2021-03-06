package br.eti.webstuff.estudosjdk8.collectors;

import java.util.List;
import java.util.Optional;

import br.eti.webstuff.estudosjdk8.builder.PopulaLista;
import br.eti.webstuff.estudosjdk8.entidade.Perfil;

public class AppRunOptinalFilterFindFirst {

	public static void main(String[] args) {
		
		
		List<Perfil> perfis = PopulaLista.populaListaTecnologias();
		
		/*Exibe o primeiro Nome do desenvolvedor que possui conhecimento pontuado igual ou superior a 5 pontos
		 na tecnologia JDK 8
		*/
		
		Optional<Perfil> optinalPerfil = perfis.stream()
                                               .filter(p -> p.getNivelConhecimento() >= 5)
                                               .filter(p -> p.getNome().equals("JDK 8"))
                                               .findFirst();
		
		System.out.println("Tecnologia: " + optinalPerfil.get().getNome() + " Dev: " + optinalPerfil.get().getNomeDesenvolvedor());
	}

}
