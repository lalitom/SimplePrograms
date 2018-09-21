package com.interview.comparators;

import java.util.Comparator;



public class Employee implements Comparable<Employee> {
	
	private int Id;
	private String Name;
	private int Age;
	private long Salary;
	
	public int getid()
	{
		return Id;
	}
	public String getName()
	{
		return Name;
	}
	public int getAge()
	{
		return Age;
	}
	public long getSalary()
	{
		return Salary;
	}
	
	Employee(int Id,String Name,int Age,long Salary)
	{
		
		this.Id=Id;
		this.Name=Name;
		this.Age=Age;
		this.Salary=Salary;
		
	}

	
	public String toString()
	{
		return "[id="+this.Id+",name="+this.Name+",Age="+this.Age+",Salary="+this.Salary+"]";
		
	}
	@Override
	public int compareTo(Employee emp) {
		
		
		return (this.Id-emp.Id);
	}

	//Anonymous class
	 public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

	        @Override
	        public int compare(Employee e1, Employee e2) {
	            return  (int) (e1.getSalary() - e2.getSalary());
	        }
	    };
	  //Anonymous class
    public static Comparator<Employee> ageComparator=new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			// TODO Auto-generated method stub
			return (e1.getAge()-e2.getAge());
		}
    	
    };
  //Anonymous class
    public static Comparator<Employee> nameComparator=new Comparator<Employee>()
    		{

				@Override
				public int compare(Employee e1, Employee e2) {
					// TODO Auto-generated method stub
					return  e1.getName().compareTo(e2.getName());
				}
    	
    	
    	
    	
    	
    		
    	
    	
    	
    };

}	
	

