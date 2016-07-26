package com.dallas.sowmiya.streamexample;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class MainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Ravi",001,"Java");	
		Employee emp2 = new Employee("Sowmiya",002,"Perl");
		Employee emp3 = new Employee("Nagamani",003,"Python");
		Employee emp4 = new Employee("Prakash",004,"Java");
		Employee emp5 = new Employee("Raj",005,"JavaScript");
		
		Function<Employee,Stream<Trainer>> employeetoTrainerConverter = (Employee employee) -> {
			System.out.println("now operating on employee "+ employee.getEmpName());
		     Trainer trainer = new Trainer();
		     if(employee.getEmpSpec() == "Java"){
		    	 trainer.setTrainerName(employee.getEmpName());
		     }
		     Set<Trainer> trainerSet = new HashSet<>();
		     trainerSet.add(trainer);
		     System.out.println("as of now content of trainer set is "+ trainerSet);
		     return trainerSet.stream();
		};
	
		
		Consumer<Trainer> trainerConsumer = (Trainer t )  -> { System.out.println("Trainer is : "+ t.getTrainerName());};
		
		Set<Employee> employeeSet = new HashSet<>();
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		employeeSet.add(emp4);
		employeeSet.add(emp5);
		
		employeeSet
		.stream()
		.flatMap(employeetoTrainerConverter)
		.forEach(trainerConsumer);

	}

}
