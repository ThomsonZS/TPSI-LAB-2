package tpsi.labs.lab2;

import java.util.ArrayList;
import java.util.List;
//do zadania 4.
public class Faculty implements EmailRecipient{
    private List<Teacher> teachers = new ArrayList<>();
    private String emailAddress;
    private String facultyName;

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Faculty(String emailAddress, String facultyName) {
        this.emailAddress = emailAddress;
        this.facultyName = facultyName;
    }
    
    public void setEmailAddress(String email) {
        this.emailAddress = email;
    }
    
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    
    @Override
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    @Override
    public String toString() {
        return this.facultyName + ", " + this.emailAddress;
    }
}
