package Staff.Management;

public class Director extends Manager {
    private double budget;

    public Director(String name, String natInsNum, double salary, String deptName){
        super(name, natInsNum, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
