package restaurant;

public class Staff {
    private String name;
    private String role;
    private double salary;

    public Staff(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary must be positive");
        }
    }
}
