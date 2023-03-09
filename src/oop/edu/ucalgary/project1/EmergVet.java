package oop.edu.ucalgary.project1;

public class EmergVet {
    private String name;
    private String phoneNum;

    public EmergVet(String name, String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName(){
        return this.name;
    }

    public String getPhoneNum(){
        return this.phoneNum;
    }
}
