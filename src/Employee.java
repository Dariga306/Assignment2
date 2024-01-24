class Employee extends Person{
    private double salary;
    private String position;

    public Employee(){
        super();
    }

    public Employee(String name, String surname, String position1, double salary1){
        super(name, surname);
        position=position1;
        salary=salary1;
    }
    public void setPosition(String position1){
        position=position1;
    }
    public void setSalary(double salary1){
        salary=salary1;
    }
    public double getSalary(){
        return salary;
    }
    public String getPosition(){
        return position;
    }

    @Override
    public double getPaymentAmount(){
        return salary;
    }
    public String toString(){
        return "Employee: "+super.toString();
    }



}
