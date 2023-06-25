package bibliothekLambdas;

public class book implements Comparable<book> {

	private String autor;
	private String isbn;
	private String title;
	
	public book(String autor, String title, String isbn) {
		this.autor = autor;
		this.isbn = isbn;
		this.title = title;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getISBN() {
		return isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return getAutor() + " \"" + getTitle() + "\"  \"" + getISBN()+"\"";
	}

	@Override
	public int compareTo(book o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(o.getTitle());
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
