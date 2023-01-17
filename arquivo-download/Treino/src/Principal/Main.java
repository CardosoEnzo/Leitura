package Principal;

import Relacoes.Livro;
import Relacoes.Pessoas;

public class Main {

	public static void main(String[] args) {
		
		Pessoas [] p = new Pessoas[2];
		Livro [] l = new Livro[3];
		
		p [0] = new Pessoas("Enzo", 18, "M");
		p [1] = new Pessoas("Célia", 51, "F");
		
		l [0] = new Livro("Nemo ", "Emerson ", 400, p[0]);
		
		l[0].detalhes();
		l[0].abrir();
		l[0].folhear(200);
		l[0].detalhes();
		l[0].avancarPag();
		l[0].detalhes();
		
		p[1].fazerAniv();
		p[1].atual();
		
	}

}
