package Assignment_1;

 abstract class Adult{

	abstract String print();
	}

	public class Childs extends Adult{
		
		@Override
		String print() {
			return ("Hello to the World my Child!");
		}
		
		public static void main(String[] args) {
			Adult c = new Childs ();
			System.out.println(c.print());
		}
		
	}
