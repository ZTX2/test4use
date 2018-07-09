package ztx;

public class Person implements Comparable{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Comparable test(int age,int age1){
       return new Person("zhang",10);
    }

}
