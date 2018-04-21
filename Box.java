package pl.pjatk.zad9;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Box<T extends Comparable<T>>{
    public static int POSITION=0;
    private List<T> set = new LinkedList<>();


    public Box() {}

    boolean add(T object) {
       return set.add(object);
    }

    boolean addAll(T[] table) {         //jak zwróci false znaczy że dodał wszystko i nic sie nie powtorzyło
        boolean returner=false;          //jak true to znaczy że był juz jakis obiekt w secie
        for(T object : table)
        {
            if(set.contains(object))
                returner=true;
            set.add(object);
        }
        return returner;
    }

    boolean delete(T object) {
        return set.remove(object);
    }

    void swap(int first, int second) {
        try {
            T help1 = set.get(first);
            T help2 = set.get(second);
            set.set(first, help2);
            set.set(second, help1);
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public T max(){
        T max = set.get(0);
        for(int i=1;i<set.size();i++){
            if(set.get(i).compareTo(max)> 0)
                max=set.get(i);
        }
        return max;
    }

    public T min(){
        T min = set.get(0);
        for(int i=1;i<set.size();i++){
            if(set.get(i).compareTo(min)< 0)
                min=set.get(i);
        }
        return min;
    }

    public boolean search(T object){
        return set.contains(object);
    }


    public void print() {
        for(T object: set) {
            System.out.println(object);
        }
    }

}
