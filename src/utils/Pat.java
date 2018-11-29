package utils;

public class Pat {

	static String pattern = "^[a-zA-Z0-9]+([\\s\\.\\-\\_]?[a-zA-Z0-9]+)*";
	
	public static void main(String[] args) {
		
		System.out.println("ds..dd".matches(pattern));
		System.out.println("ds.dd d".matches(pattern));
		System.out.println("ds.dd-fd_d".matches(pattern));
		System.out.println("ds.dd-fd d".matches(pattern));

	}

}
