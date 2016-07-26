class ShortcircuitExample{

	public static void main(String[] args){
	int input = Integer.parseInt(args[0]);
	int num1 = 5;
	int num2 = 10;

	if( gtFive(input) && ltTen(input)){
	   System.out.println("Input is within 5 to 10 !!!");
	}else{
	   System.out.println("Input is NOT within 5 to 10 !!!");
	} 
	
	if(input % 2 == 0 ||  input % 3 == 0){
	   System.out.println("Input is divisible by 2 and 3 !!!");
	}

	}

      static boolean gtFive(int num){
       System.out.println("check if more than five"); 
       return (num > 5);
      }

        static boolean ltTen(int num){
       System.out.println("check if less than ten"); 
       return (num < 10);
      }

}
