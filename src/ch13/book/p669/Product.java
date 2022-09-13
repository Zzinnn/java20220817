package ch13.book.p669;

public class Product<T,M> {
	private T kind;
	private M model;
	
	public T getKind( ) { return this.kind; }
	public M getModel() { return this.model; }
	
	
}

class Tv {}
