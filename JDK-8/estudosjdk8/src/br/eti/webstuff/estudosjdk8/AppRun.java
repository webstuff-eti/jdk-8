package br.eti.webstuff.estudosjdk8;

import java.util.Comparator;
import java.util.List;

import br.eti.webstuff.estudosjdk8.builder.PopulaLista;
import br.eti.webstuff.estudosjdk8.entidade.Perfil;


public class AppRun {

	public static void main(String[] args) {
		
		
		List<Perfil> perfis = PopulaLista.populaListaTecnologias();
		
		
		//perfis.sort(Comparator.comparingInt(p -> p.getMesesAtuando()));
		perfis.sort(Comparator.comparingInt(Perfil::getMesesAtuando));
		
		perfis.forEach( p -> System.out.println(p.getNome()));
		
		
		
		

	}

}
