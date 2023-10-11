package welcome;

public class DecoderApp {

	public static void main(String[] args) {
		Decoder s1 = new Decoder();
		int res = s1.decode('A');
		System.out.println("The unnicoad of character = " +res);
	}

}
