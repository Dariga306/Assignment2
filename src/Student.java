class Student extends Person{
    final static double scholarship=36660.00;//declares a constant for all student objects
    private double gpa;//instance variable to store the GPA of a student
    public Student(){//A default constructor that calls the default constructor of the superclass (Person)
        super();
    }
    public Student(String name, String surname, double gpa){ //parameterized constructor that takes the name, surname, and GPA of a student and initializes the object with these values
        super(name, surname);
        this.gpa=gpa;
    }
    public void setGpa(double gpa1){//This method sets the GPA of the student
        this.gpa=gpa;
    }
    public double getGpa(){//This method returns the GPA of the student
        return gpa;
    }
    @Override  //This method overrides the toString() method inherited from the Person class to provide a custom string representation for Student objects
    public String toString(){
        return "Student: "+super.toString();
    }
    public double getPaymentAmount(){//This method calculates the payment amount for a student based on their GPA
        if(gpa>2.67){
            return scholarship;
        }
        else{
            return 0.00;
        }
    }



}
