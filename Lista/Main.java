package Lista;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("How many employees will be registered?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Employee> employeesList = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Employee # "+ i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(employeesList,id)){
                System.out.println("Id already taken, choose another one");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            Employee employee = new Employee(id,name,salary);
            employeesList.add(employee);
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = employeesList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("id does not exist!");
        }
        else{
            System.out.println("Enter the percentage: ");
            Double percentage =  sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        for(Employee employee  : employeesList){
            System.out.println(employee.getId() + employee.getName() + employee.getSalary());
        }
    }
    public static boolean hasId(List<Employee> list , int id){
        for(Employee employee : list){
            return employee.getId() == id;
        }
        return false;
    }
}
