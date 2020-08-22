package generics;

public class Height<T> extends AbstractParam<T> {
	public static void main(String[] args) {
		Height<Integer> h=new Height<>();
		h.setValue(6);
		System.out.println(h.getValue());
	}

}
