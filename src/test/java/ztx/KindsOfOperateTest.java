package ztx;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class KindsOfOperateTest {
    int a;
    int b;
    KindsOfOperate kindsOfOperate;

    @Before
    public void setUp() throws Exception {
        a = 10;
        b = 2;
        kindsOfOperate = new KindsOfOperate();
    }

    @Test
    public void testAdd() throws Exception {

        assertEquals(12, kindsOfOperate.add(a, b));
    }

    @Test
    public void testCheng() throws Exception {
        //Optional<Integer> optional=Optional.ofNullable(null);
        //Optional<Integer> optional1=Optional.of(null);
        // System.out.println(optional.get());

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list = list.stream().filter(a -> a > 20).collect(Collectors.toList());
        System.out.println(list);

        List<Integer> list1 = list.stream().filter(a -> a > 40).collect(Collectors.toList());
        List<Integer> list2 = Optional.ofNullable(list.stream().filter(a -> a > 40).collect(Collectors.toList())).orElse(list);

        System.out.println(list2);
        Integer integer2 = list.stream().filter(a -> a > 40).findFirst().orElse(3);
        Optional<Integer> integer = list.stream().filter(a -> a > 40).findAny();
        integer.ifPresent(d -> System.out.println(d));
        assertEquals(20, kindsOfOperate.cheng(a, b));
    }



    /*
    @Test
    public void testMin() throws Exception {
        assertEquals(2,kindsOfOperate.min(a,b));
    }
*/
}