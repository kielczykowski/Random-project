package pl.pjatk.zad9;

public class Osoba implements Comparable<Osoba> {
    private String surname;
    private int age;

    public Osoba(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString()
    {
        return "Osoba: " + surname + ", " + age;
    }


    @Override
    public int compareTo(Osoba osoba) {
        if(this.surname.equals(osoba.getSurname())) {
            return this.age-osoba.getAge();
        }
        else
            return this.surname.compareTo(osoba.getSurname());
    }
}



