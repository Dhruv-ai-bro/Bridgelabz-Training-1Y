class Employee {
    protected String name;
    protected int id;
    protected double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method
    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("Salary        : " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size     : " + teamSize);
    }
}

// Subclass Developer
class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int id, double salary,
                     String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language : "
                + programmingLanguage);
    }
}

// Subclass Intern
class Intern extends Employee {

    private int internshipDuration; // in months

    public Intern(String name, int id, double salary,
                  int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration  : "
                + internshipDuration + " months");
    }
}

// Main class


    public static void main(String[] args) {


        Employee e1 = new Manager("Rahul", 101, 80000, 10);
        Employee e2 = new Developer("Priya", 102, 60000, "Java");
        Employee e3 = new Intern("Aman", 103, 15000, 6);


        Employee[] employees = {e1, e2, e3};


        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("---------------------------");
        }
    }

}
