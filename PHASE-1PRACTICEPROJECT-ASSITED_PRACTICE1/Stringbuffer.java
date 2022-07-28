package Stringbuffer;

public class Buffer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("Started Java");
		s.append("Phase1");
		System.out.println(s);
		s.delete(2, 5);
		System.out.println(s);
		s.replace(5, 9,"Python");
		System.out.println(s);
		s.insert(5, "Language");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.charAt(9));
	}
}

