package Lista;

public class Employee {
    private int id;
    private String name;
    private Double salary;

    public Employee(int id,String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseSalary(Double value){
        this.salary += this.salary * value/100;
    }
}
