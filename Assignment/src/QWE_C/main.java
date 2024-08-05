package QWE_C;

public class main {
    public static void main(String[] args) {
        Employee employee= new Employee(1,"Orish" , "Baidhya" , 550);

        System.out.println(employee.toString());
        employee.raiseSalary(10);
        System.out.println(employee.toString());
    }
}
