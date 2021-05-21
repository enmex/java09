import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private String middlename;
    private int age;
    private Sex sex;

    public Human(String name, String surname, String middlename, int age, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && name.equals(human.name) && surname.equals(human.surname) && middlename.equals(human.middlename) && sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, middlename, age, sex);
    }
}
