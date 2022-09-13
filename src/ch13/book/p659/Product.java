package ch13.book.p659;

public class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKind() { return this.kind; }
	public M getMedel() { return this.model; }
	
	public void setKind(T Kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
	
}
