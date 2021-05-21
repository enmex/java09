public class Student extends Human{

    private String university;
    private String faculty;
    private String speciality;

    public Student(String name, String surname, String middlename, int age, Sex sex,
                   String university, String faculty, String speciality) {
        super(name, surname, middlename, age, sex);
        this.faculty = faculty;
        this.university = university;
        this.speciality = speciality;
    }
}
