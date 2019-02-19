package br.eti.webstuff.estudosjdk8;

import java.util.List;

import br.eti.webstuff.estudosjdk8.builder.PopulaLista;
import br.eti.webstuff.estudosjdk8.entidade.Perfil;
import br.eti.webstuff.estudosjdk8.enumeration.Nivel;

public class AppRunStreamFilterForEach {

	public static void main(String[] args) {
	
		
		List<Perfil> perfis = PopulaLista.populaListaTecnologias();
		
		perfis.stream()
			  .filter(p -> p.getMesesAtuando() >= 5)
			  .filter(P -> P.getNome().equals("Spring Boot"))
			  .filter(p -> p.getNivel().equals(Nivel.SENIOR))
			  .forEach(p -> System.out.println(p.getNomeDesenvolvedor()));
	}
	
	
	
}
