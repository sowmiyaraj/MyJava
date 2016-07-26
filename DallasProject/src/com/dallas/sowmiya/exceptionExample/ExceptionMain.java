package com.dallas.sowmiya.exceptionExample;

public class ExceptionMain {

	 static void read(String subname) throws StudentIsTiredException, ClassCancelledException{
		 /*System.out.println("student is reading");
		 throw new StudentIsTiredException("I am just tired of studying");
		 System.out.println("class is starting");
		 throw new ClassCancelledException("Class is cancelled..Student tired !!! ");*/
		 if (subname == "Maths"){
			 throw new StudentIsTiredException("  I am just tired of studying of Maths");	 
		 }else{
			 throw new ClassCancelledException("  Class is cancelled..Student tired !!! ");
		 }
		 
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
            int [] myArray = {5,10,15};
          //  read("Math");
		//	myArray[10] = 30;
		}/*catch(Exception e){
			e.printStackTrace();
		}*/
		catch (java.lang.ArrayIndexOutOfBoundsException arrayException){
			System.out.println("araray index exception occurred...");
		}
	/*	catch(StudentIsTiredException tiredException){
			System.out.println("!!! tired "+ tiredException.toString());
		}
*/		catch(Exception s){
			System.out.println("generic exception" + s.toString());
		}
        finally{
        	System.out.println("this is finally block");
        }
	}

}
