package Relacoes;

public class Livro implements Publicacao {
	
	private String titulo;
	private String autor;
	private int totPag;
	private int pagAtual;
	private boolean aberto;
	private Pessoas leitor;
	
	public void detalhes() {
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(+this.pagAtual);
		System.out.println(leitor.getNome());
	}
	
	public Livro(String ti, String autor, int tot, Pessoas leit) {
		this.titulo = ti;
		this.autor = autor;
		this.totPag = tot;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leit;
	}
	
	@Override
	public void abrir() {
		this.aberto=true;
		
	}
	@Override
	public void fechar() {
		this.aberto=false;
		
	}
	@Override
	public void folhear(int p) {
		if(this.aberto && p<=this.totPag) {
			this.pagAtual = p;
		}
		else {
			this.pagAtual = 0;
		}
	}
	@Override
	public void avancarPag() {
		if(this.aberto) {
		this.pagAtual++;
		}
		else {
			this.pagAtual=0;
		}
	}
	@Override
	public void voltarPag() {
		if(this.aberto) {
			this.pagAtual--;
		}
		else {
			this.pagAtual=0;
		}
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPag() {
		return totPag;
	}
	public void setTotPag(int totPag) {
		this.totPag = totPag;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoas getLeitor() {
		return leitor;
	}
	public void setLeitor( Pessoas leitor) {
		this.leitor = leitor;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	

}
