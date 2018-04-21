package pl.pjatk.zad9;

public class Main {

    public static void main(String[] args) {
        Box<Osoba>  bo = new Box<>();
        bo.add(new Osoba("Kowalski", 19));                              // nazwisko, wiek
        bo.add(new Student("Kowalska", 18, 100));                    // nazwisko, wiek, grupa
        bo.add(new Student("Kowalska", 20, 200));
        Osoba[] to = new Osoba[] {new Osoba("Nowak", 21), new Student("Nowak", 22, 200)};
        bo.addAll(to);
        bo.print();
        System.out.println(bo.min());                                           // Student: Kowalska, 18, 100

        Box<Student> bst = new Box<>();
        bst.add(new Student("Nowacka", 24, 100));
        bst.add(new Student("Nowacka", 24, 300));
        bst.add(new Student("Nowacka", 24, 200));
        bst.print();
        System.out.println(bst.max());                                          // Student: Nowacka, 24, 300

        Box<Integer> bi = new Box<>();
        Integer[] ti = new Integer[] {new Integer(1), 2, 3};
        bi.addAll(ti);
        bi.print();                                                                          // 1, 2, 3

        Box<String> bs = new Box<>();
        String[] ts = new String[] {"cpp", new String("java")};
        bs.addAll(ts);
        bs.swap(0,1);
        bs.print();                                                                         // java, cpp
    }
}
