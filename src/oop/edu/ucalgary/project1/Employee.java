package oop.edu.ucalgary.project1;

public class Employee {
    private String name;
    private final String IDNUMBER;
    private String managerID;
    private Employee[] supervisedEmployees = new Employee[10];

    public Employee(String name, String IdNumber){
        this.name = name;
        this.IDNUMBER = IdNumber;
    }

    public Employee(String name, String IDNumber, String managerID){
        this.name = name;
        this.IDNUMBER = IDNumber;
        this.managerID = managerID;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getIDNumber(){
        return this.IDNUMBER;
    }

    public String getManagerID(){
        return this.managerID;
    }

    public void setManagerID(String newManager){
        this.managerID = newManager;
    }

    public void addEmployee(Employee newEmployee){
        for(int i = 0; i < this.supervisedEmployees.length; i++){
            if(this.supervisedEmployees[i] == null){
                this.supervisedEmployees[i] = newEmployee;
                break;
            }
        }
    }

    public Employee[] getEmployees(){
        return this.supervisedEmployees;
    }
}
