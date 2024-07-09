package Homework.Homework7;
class Employee {
    public Employee(int c, double a, String b){
        ID = c;
        Surname = b;
        salary = a;
    }
    private Employee(int a,String c, double b) {
        ID = a;
        Surname = c;
        salary = b;
    }
    Employee(double a, int c, String b){
        ID = c;
        Surname = b;
        salary = a;
    }
   protected int ID;
   public String Surname;
    int age;
   private double salary;
    String department;

    public void Salaryy(){
        System.out.println(salary);
    }

    public void Surnamee (){
        System.out.println(Surname);
    }

    public void IDD(){
        System.out.println(ID);
    }
    void x2Salary (){
        salary *= 2;
    }
    void Info() {
        System.out.println("ID: " + ID);
        System.out.println("Surname: " + Surname + ", age: " + age + ", salary: " + salary + ", department: " + department);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(3, "wawa", 2312.2 );
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee(2500.1, 1, "Malinow");
        Employee e2 =  new Employee(2, 2331.1, "WWWW");
        e1.IDD();
        e1.Surnamee();
        e1.Salaryy();
    }
}