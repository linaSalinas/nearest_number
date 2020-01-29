package avl;

public class ArbolAVL<Key extends Comparable<Key>,Value> {
	
	private NodoAVL<Key,Value> raiz;
	
	public ArbolAVL(NodoAVL<Key, Value> r) {
		raiz=r;
	}

}
