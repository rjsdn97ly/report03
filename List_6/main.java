package List_6;

public class main {

	public static void main(String[] args) {
		CList<String> s = new CList<String>();
		
		s.insert("pear"); s.insert("cherry");
		s.insert("orange"); s.insert("apple");
		s.print();
		System.out.println(":s의 길이 = "+s.size()+"\n");
		
		s.delete();
		s.print();
		System.out.println(":s의 길이 = "+s.size());
		System.out.println();

	}

}
