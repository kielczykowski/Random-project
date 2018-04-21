package pl.pjatk.zad9;

public class Student extends Osoba {
    private int group;

    public Student(String surname, int age, int group) {
        super(surname, age);
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student: " + getSurname() + ", " + getAge() + ", " + group;
    }


    @Override
    public int compareTo(Student object) {

    }

//    public int compareTo(Student object) {
//        if(this.getSurname().equals(object.getSurname())) {
//            if(this.getAge()==object.getAge()) {
//                return this.group-object.getGroup();
//            }
//            else
//                return this.getAge()-object.getAge();
//        }
//        else
//            return this.getSurname().compareTo(object.getSurname());
//    }
}
