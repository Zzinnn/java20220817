package ch13.book;

public class Util {
	public static <K, V> V getValue(Pair<? extends K, ? extends V> pair, K key) {
		if (pair.getKey().equals(key)) {
			return pair.getValue();
		}
		
		return null;
	}
}
