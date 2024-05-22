package school_library_task5;

import school_library_task5_library_service.Gender;

public class Teacher extends Person{

    public Teacher(String fullName, int age, int id, int priorityLabel, Gender gender, Role role) {
        super(fullName, age, id, priorityLabel, gender, role);
    }
}
