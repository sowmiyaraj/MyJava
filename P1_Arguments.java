//java P1_Arguments So Ra

class P1_Arguments{
	public static void main(String[] args){
		//String user1 = "So";
	    //String user2 = "Ra";
		String user1 = args[0];
	    String user2 = args[1];
		method1(user1,user2);
	}
	public static void method1(String name1, String name2){
		System.out.println("Good Morning " + name1 + name2);		
	}
	
}