package POJO;

public class Student {
    // Plain Old Java Object
    private String id;
    private String name;
    private String dateofBirth;
    private String classList;

    public Student(String id, String name, String dateofBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateofBirth='" + dateofBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
