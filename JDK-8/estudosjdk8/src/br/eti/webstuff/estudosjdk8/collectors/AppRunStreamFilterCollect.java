package br.eti.webstuff.estudosjdk8.collectors;

import java.util.List;
import java.util.stream.Collectors;

import br.eti.webstuff.estudosjdk8.builder.PopulaLista;
import br.eti.webstuff.estudosjdk8.entidade.Perfil;

public class AppRunStreamFilterCollect {

	public static void main(String[] args) {
		
		
		List<Perfil> perfis = PopulaLista.populaListaTecnologias();
		
		/*
		  Atualiza a lista apenas com valores contidos no filtro 
		*/
		
		perfis = perfis.stream()
				       .filter(p -> p.getMesesAtuando() >= 9)
				       .filter(p -> p.getNome().equals("JDK 8"))
				       .collect(Collectors.toList());
		
		perfis.stream().forEach(p -> System.out.println(p.getNomeDesenvolvedor()));
				       

	}

}
