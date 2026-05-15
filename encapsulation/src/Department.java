interface Department {
        void assignDepartment(String deptName);
        String getDepartmentDetails();
    }


    abstract class Employee implements Department {

        private int employeeId;
        private String name;
        private double baseSalary;
        protected String department;


        public Employee(int employeeId, String name, double baseSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.baseSalary = baseSalary;
        }


        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        public void setBaseSalary(double baseSalary) {
            this.baseSalary = baseSalary;
        }


        abstract double calculateSalary();


        public void displayDetails() {
            System.out.println("Employee ID : " + employeeId);
            System.out.println("Name        : " + name);
            System.out.println("Department  : " + department);
            System.out.println("Salary      : " + calculateSalary());
            System.out.println("-----------------------------");
        }


        public void assignDepartment(String deptName) {
            this.department = deptName;
        }

        public String getDepartmentDetails() {
            return "Department: " + department;
        }
    }


    class FullTimeEmployee extends Employee {

        public FullTimeEmployee(int employeeId, String name, double fixedSalary) {
            super(employeeId, name, fixedSalary);
        }

        @Override
        double calculateSalary() {
            return getBaseSalary(); // fixed salary
        }
    }


    class PartTimeEmployee extends Employee {

        private int workHours;
        private double hourlyRate;

        public PartTimeEmployee(int employeeId, String name,
                                double hourlyRate, int workHours) {
            super(employeeId, name, 0);
            this.hourlyRate = hourlyRate;
            this.workHours = workHours;
        }


        public int getWorkHours() {
            return workHours;
        }

        public void setWorkHours(int workHours) {
            this.workHours = workHours;
        }

        public double getHourlyRate() {
            return hourlyRate;
        }

        public void setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
        }

        @Override
        double calculateSalary() {
            return hourlyRate * workHours;
        }


        public static void main(String[] args) {


            Employee emp1 = new FullTimeEmployee(101, "Rahul", 50000);
            Employee emp2 = new PartTimeEmployee(102, "Priya", 500, 80);


            emp1.assignDepartment("IT");
            emp2.assignDepartment("HR");


            Employee[] employees = {emp1, emp2};


            for (Employee emp : employees) {
                emp.displayDetails();
            }
        }
    }

