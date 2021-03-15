import com.xhc.java.dutySort.Person;
import com.xhc.java.dutySort.PersonComparator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TestClient {

    @Test
    public void sortDemo() {
        // 排序规则
        HashMap<String, Integer> rule = new HashMap<String, Integer>();
        rule.put("董事", 0);
        rule.put("副董事长", 1);
        rule.put("执行董事", 2);
        rule.put("监事", 3);
        // 排序数据
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("罗小波", "监事"));
        people.add(new Person("梁毅", "副董事长,副总经理"));
        people.add(new Person("陈跃", "董事,副总经理"));
        people.add(new Person("李宗福", "董事,总经理"));
        people.add(new Person("喳喳辉", ""));
        people.add(new Person("王成辉", "职工代表董事"));
        // 排序前
        for (Person p : people) {
            System.out.println(p);
        }
        // 排序
        Collections.sort(people, new PersonComparator(rule));
        System.out.println("***********************");
        // 排序后
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
