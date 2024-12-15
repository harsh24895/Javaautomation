package ch9_inheritance;

import javax.xml.namespace.QName;

public class Employee extends Person {

    private String employeeId;
    private String title;

    //Ch9b constructrs in inheritance
    public Employee(){
        // if we state here super(); it will call the default constructor from Person class, however if we set parameter init it will call another constructor
        // and if we need to call constructor it should be the first line only
        super("test");
        System.out.println("in the Employee default constructor");
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
