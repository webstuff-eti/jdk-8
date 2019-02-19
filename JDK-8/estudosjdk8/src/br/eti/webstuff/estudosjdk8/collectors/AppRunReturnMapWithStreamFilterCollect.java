package br.eti.webstuff.estudosjdk8.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.eti.webstuff.estudosjdk8.builder.PopulaLista;
import br.eti.webstuff.estudosjdk8.entidade.Perfil;
import br.eti.webstuff.estudosjdk8.enumeration.Nivel;


public class AppRunReturnMapWithStreamFilterCollect {

	public static void main(String[] args) {

		
		/*
		   Retorna um MAPA contendo o NOME DA TECNOLOGIA como chave, e o NÍVEL DE CONHECIMENTO como valor para todos 
		   os valores da lista de PERFIS cujo nível seja SENIOR e o Nível de conhecimento seja superior a 9 pontos de 10.
		*/
		
		List<Perfil> perfis = PopulaLista.populaListaTecnologias();
		
		Map<String, Integer> map = perfis.stream()
				                         .filter(p -> p.getNivel().equals(Nivel.SENIOR))
				                         .filter(p -> p.getNivelConhecimento() > 9)
				                         .collect(Collectors.toMap( p -> p.getNome(),
				                        		                    p -> p.getNivelConhecimento()));
				                         
		
		System.out.println(map);
		

	}

}
