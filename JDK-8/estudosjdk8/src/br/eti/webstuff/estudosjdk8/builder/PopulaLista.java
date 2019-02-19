package br.eti.webstuff.estudosjdk8.builder;

import java.util.ArrayList;
import java.util.List;

import br.eti.webstuff.estudosjdk8.entidade.Perfil;
import br.eti.webstuff.estudosjdk8.enumeration.Nivel;

public class PopulaLista {
	
	
	public static List<Perfil> populaListaTecnologias(){
		
		List<Perfil> perfis = new ArrayList<>();
		
		perfis.add(new Perfil( 1, "JDK 8", Nivel.PLENO, true, true, 5, "Fulano 01", 3));
		perfis.add(new Perfil( 2, "JDK 8", Nivel.PLENO, false, true, 6, "Fulano 02", 4));
		perfis.add(new Perfil( 3, "JDK 8", Nivel.PLENO, false, true, 6, "Fulano 03", 4));
		perfis.add(new Perfil( 4, "JDK 8", Nivel.PLENO, true, true, 8, "Fulano 04", 5));
		
		perfis.add(new Perfil( 5, "JDK 8", Nivel.SENIOR, false, true, 9, "Fulano 05", 6));
		perfis.add(new Perfil( 6, "JDK 8", Nivel.SENIOR, true, true, 10, "Fulano 06", 7));
		perfis.add(new Perfil( 7, "JDK 8", Nivel.SENIOR, true, true, 11, "Fulano 07", 8));
		perfis.add(new Perfil( 8, "JDK 8", Nivel.SENIOR, true, true, 12, "Fulano 08", 9));
		
		
		perfis.add(new Perfil( 9, "Spring Boot", Nivel.SENIOR, true, true, 5, "Fulano 09", 3 ));
		perfis.add(new Perfil( 10, "Rest Full", Nivel.PLENO, true, true, 36, "Fulano 10", 10 ));
		perfis.add(new Perfil( 11, "Spring Data JPA", Nivel.PLENO, true, true, 5, "Fulano 11", 3 ));
		perfis.add(new Perfil( 12, "PL/ SQL", Nivel.JUNIOR, true, true, 8, "Fulano 12", 5 ));
		perfis.add(new Perfil( 13, "Protocolo HTTP", Nivel.SENIOR, true, true, 36, "Fulano 13", 10 ));
		
		return perfis;
	}

}
