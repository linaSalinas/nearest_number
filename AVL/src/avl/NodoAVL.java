package avl;

public class NodoAVL<Key extends Comparable<Key>, Value> {
	
	private Key key;
	private Value value;
	private NodoAVL<Key, Value> left;
	private NodoAVL<Key, Value> rigth;
	private int altura;
	private int fBalanceo;
	
	public NodoAVL(Key key, Value value) {
		this.key = key;
		this.value = value;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public NodoAVL<Key, Value> getLeft() {
		return left;
	}

	public void setLeft(NodoAVL<Key, Value> left) {
		this.left = left;
	}

	public NodoAVL<Key, Value> getRigth() {
		return rigth;
	}

	public void setRigth(NodoAVL<Key, Value> rigth) {
		this.rigth = rigth;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getfBalanceo() {
		return fBalanceo;
	}

	public void setfBalanceo(int fBalanceo) {
		this.fBalanceo = fBalanceo;
	}

}
