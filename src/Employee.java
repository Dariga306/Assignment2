class Employee extends Person{ // Employee and Student are subclasses of the `Person` class.
    private double salary;// Represents the salary of the employee
    private String position;//Represents the position of the employee

    public Employee(){//Default constructor that calls the default constructor of the superclass (Person)
        super();
    }

    public Employee(String name, String surname, String position1, double salary1){
        super(name, surname);
        position=position1;
        salary=salary1;
    }//Parameterized constructor that sets the name, surname, position, and salary of the employee
    public void setPosition(String position1){
        position=position1;
    }
    public void setSalary(double salary1){
        salary=salary1;
    }//Sets the position and salary of the employee
    public double getSalary(){
        return salary;
    }
    public String getPosition(){
        return position;
    }//Retrieves the position and salary of the employee

    @Override
    public double getPaymentAmount(){
        return salary;
    }//Overrides the getPaymentAmount() method inherited from the Person class to return the salary of the employee
    public String toString(){
        return "Employee: "+super.toString();
    }//Overrides the `toString()` method inherited from the `Person` class to provide a custom string representation for `Employee` objects, which includes the label "Employee" followed by the details inherited from the `Person` class



}
