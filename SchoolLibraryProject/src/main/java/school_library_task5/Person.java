package school_library_task5;

import school_library_task5_library_service.Gender;

public class Person {

    private String fullName;
    private int age;
    private int id;
    private int priorityLabel;
    private Gender gender;
    protected Role role;

    public Person(String fullName, int age, int id, int priorityLabel, Gender gender, Role role) {
        this.fullName = fullName;
        this.age = age;
        this.id = id;
        this.priorityLabel = priorityLabel;
        this.gender = gender;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", priorityLabel=" + priorityLabel +
                ", gender=" + gender +
                ", role=" + role +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriorityLabel() {
        return priorityLabel;
    }

    public void setPriorityLabel(int priorityLabel) {
        this.priorityLabel = priorityLabel;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}