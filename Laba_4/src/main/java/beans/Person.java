package beans;

import beans.Department;
public class Person {
    private int ID;
    private String name;
    private String gender;
    private Department department;
    private int salary;
    private String birthday;

    public Person(int ID, String name, String gender, int salary, String birthday, int departmentId, String departmentName) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.birthday = birthday;
        this.department = new Department(departmentId, departmentName);
    }

    public String toString() {
        return String.valueOf(ID) + ' ' + name + ' ' + gender + ' ' + department.toString() + ' ' + String.valueOf(salary) + ' ' + birthday;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
