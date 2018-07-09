package ztx;

import org.apache.log4j.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.minBy;

/**
 * Hello world!
 */
public class App {

    private static final Logger logger = Logger.getLogger(App.class.getClass());

    public static void change(Person person) {
        person.age--;
    }

    public static void main(String[] args) {
        SimpleLayout layout = new SimpleLayout();
        //HTMLLayout  layout = new HTMLLayout();
        FileAppender appender = null;
        try {
            //把输出端配置到out.txt
            appender = new FileAppender(layout, "out.txt", false);
        } catch (Exception e) {
        }
        logger.addAppender(appender);//添加输出端
        logger.setLevel((Level) Level.DEBUG);//覆盖配置文件中的级别
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
//        System.out.println( "Hello World!" );
//        logger.setLevel(Level.INFO);
//        logger.debug("我是logger1，debug");
//        logger.info("我是logger1，info");
//        logger.warn("我是logger1，warn");
//        logger.error("我是logger1，error");
//        logger.fatal("我是logger1，fatal");
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("zhang", 25);
        people.add(person1);
        people.add(new Person("liu", 22));
        people.add(new Person("deng", 22));
        Person testPerson = new Person("shi", 23);

        List<Person> result = people.stream().filter(person -> person.age < testPerson.age).collect(Collectors.toList());
        Person result2 = people.stream().reduce((person, person2) -> person.getAge() < person2.getAge() ? person : person2).get();
        Person result3 = people.stream().min(Comparator.comparing(Person::getAge)).get();
        System.out.println(result3.name + " " + result3.age);
        Person result4 = people.stream().collect(minBy(comparing(Person::getAge))).get();
        System.out.println(result.size());
        people.get(0).test(10, 11);
        System.out.println(people.get(0).test(10, 11));
        Person person=person1;
        change(person);
        System.out.println(person1.getAge());

        System.out.println(person1.getClass().getName());
        System.out.println(person1.getClass().getPackage());

    }
}
