package br.edu.iff.bancodepalavras.dominio.letra.texto;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.LetraFactoryImpl;

//Singleton
public class LetraTextoFactory extends LetraFactoryImpl {

	private static LetraTextoFactory soleInstance = null;

	//Implementação do Singleton
	public static LetraTextoFactory getSoleinstance() {
		if (soleInstance == null) {
			soleInstance = new LetraTextoFactory();
		}
		return soleInstance;
	}

	private LetraTextoFactory() {

	}

	@Override
	protected Letra criarLetra(char codigo) {
		return new LetraTexto(codigo);
	}

}