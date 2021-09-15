package modell;

import java.util.Formatter;

public class Employee {
    private java.lang.String name;
    private java.lang.String gender;
    private Double age;
    //  private boolean onHoliday;

    public Employee() {
    }


    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getGender() {
        return gender;
    }

    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    @Override
    public java.lang.String toString() {
        Formatter formatter = new Formatter();
        formatter.format("%.0f", age);

        return
                name + "," +
                        gender + "," +
                        formatter;

    }
}
