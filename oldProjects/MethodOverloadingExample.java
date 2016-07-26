class MethodOverloadingExample{
	
	public static void main(String[] args){
	
	read();
        read(5);
        read(5, "java");
        Integer hour = new Integer(10);
        read(hour);

	}

	static  void read(){
		System.out.println("Reading");
	}

     static   boolean read()
      {
       }
        static void read(Integer hour)
        {
           System.out.println("Reading using Integer "+ hour);
             
         }

	static void read(int hours){
		System.out.println("Reading for" + hours);
	}

	static void read(int hours, String subname){
		System.out.println("Reading" + subname + "for" + hours);
	}


}
