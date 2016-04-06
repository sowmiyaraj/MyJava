class StaticExample{
	
	static{
		System.out.println("This is static block");
	}
	
	
	static int age = 30;
	int marks = 90;
	
	static void printHello(){
		System.out.println("helo!!!");
	}
	
	void printBye(){
		System.out.println("bye bye");
	}
	public static void main(String[] args){
		StaticExample staticObj1 = new StaticExample();
		StaticExample staticObj2 = new StaticExample();
		StaticExample staticObj3 = new StaticExample();
	    System.out.println("age for 1st"+ staticObj1.age);
		System.out.println("age for 1st"+ staticObj2.age);
		System.out.println("age for 1st"+ staticObj3.age);
		staticObj3.age = 45;
		age= 56;
		staticObj3.marks = 88;
		System.out.println("age for 1st"+ staticObj1.age);
		System.out.println("age for 1st"+ staticObj2.age);
		System.out.println("age for 1st"+ staticObj3.age);
		 System.out.println("marks for 1st"+ staticObj1.marks);
		 System.out.println("marks for 1st"+ staticObj2.marks);
		 System.out.println("marks for 1st"+ staticObj3.marks);
		 StaticExample.printHello();
		 staticObj3.printHello();
		 printHello();
		 staticObj3.printBye();
	}	
	static{
		System.out.println("This is static block 2");
	}
	
}