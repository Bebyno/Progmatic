package modell;

public class Employee {
    private java.lang.String name;
    private java.lang.String gender;
    private Double age;
  //  private boolean onHoliday;

    public Employee() {
    }

   /* public Employee(java.lang.String name, java.lang.String gender, java.lang.Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(java.lang.String name, int age, boolean gender2) {
        this.name = name;
        this.age = age;
        this.onHoliday = gender2;
    }*/

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
        return
                name + "," +
                        gender + "," +
                        age;

}}
