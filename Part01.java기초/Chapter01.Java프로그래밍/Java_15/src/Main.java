// Java 프로그래밍 - 컬렉션 프레임워크

import java.util.*;

public class Main {

    public static void main(String[] args) {

//      1. List
//        1-1. ArrayList
        ArrayList list1 = new ArrayList();
        list1.add(1); // 데이터 추가
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1);

        list1.remove(Integer.valueOf(2)); // index가 아닌 값으로 데이터 삭제
        System.out.println("list1 = " + list1);

        list1.add(0, 10); // 지정 위치에 데이터 추가
        System.out.println("list1 = " + list1);
        System.out.println("list1.size() = " + list1.size()); // 크기 확인
        System.out.println("list1.contains(1) = " + list1.contains(1)); // 해당 값 있는지 확인
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10)); // 인덱스 찾기

//      1-2. LinkedList
        System.out.println("== LinkedList ==");
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list2 = " + list2);
        list2.addFirst(10); // 처음에 데이터 추가
        list2.addLast(20); // 마지막에 데이터 추가
        System.out.println("list2 = " + list2);
        list2.remove(Integer.valueOf(1));
        System.out.println("list2 = " + list2);
        list2.removeFirst(); // 처음 삭제
        list2.removeLast(); // 마지막 삭제
        System.out.println("list2 = " + list2);
        System.out.println(list2.size()); // 크기 확인


//      2. Set
//      2-1. HashSet
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1); // 데이터 추가
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1); // 값 삭제
        System.out.println("set1 = " + set1);
        set1.add(2); // 중복 데이터 추가는 허용 안함
        set1.add(3);
        System.out.println("set1 = " + set1);
        System.out.println(set1.size()); // 크기 확인
        System.out.println(set1.contains(2)); // 데이터 있는지 확인
        
//      2-2. TreeSet
        System.out.println("== TreeSet ==");
        TreeSet set2 = new TreeSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("set2 = " + set2);
        set2.remove(2); // 값 삭제
        System.out.println("set2 = " + set2);
        set2.clear(); // 초기화
        System.out.println("set2 = " + set2);
        set2.add(10);
        set2.add(5);
        set2.add(15);
        set2.add(15); // 중복 데이터 추가는 허용 안함
        System.out.println("set2 = " + set2);
        System.out.println(set2.first()); // 처음 값
        System.out.println(set2.last()); // 마지막 값
        System.out.println(set2.lower(10)); // 10보다 작은 값
        System.out.println(set2.higher(10)); // 10보다 큰 값


//      3. Map
//      3-1. HashMap
        System.out.println("== HashMap ==");
        HashMap map1 = new HashMap();
        map1.put(1, "kiwi"); // 데이터 추가 (키, 값)
        map1.put(2, "apple");
        map1.put(3, "mango");
        System.out.println("map1 = " + map1);
        
        map1.remove(2); // key로 데이터 삭제
        System.out.println("map1 = " + map1);
        System.out.println("map1.get(1) = " + map1.get(1)); // key로 value 값 반환


//      3-2. TreeMap
        System.out.println("== TreeMap ==");
        TreeMap map2 = new TreeMap();
        map2.put(10, "kiwi"); // 데이터 추가
        map2.put(5, "apple");
        map2.put(15, "mango");
        System.out.println("map2 = " + map2);

        System.out.println(map2.firstEntry()); // 처음 key와 value 쌍
        System.out.println(map2.firstKey()); // 처음 key
        System.out.println(map2.lastEntry()); // 마지막 key와 value 쌍
        System.out.println(map2.lastKey()); // 마지막 key
        System.out.println(map2.lowerEntry(10)); // 10보다 작은 key와 value 쌍
        System.out.println(map2.higherEntry(10)); // 10보다 큰 key와 value 쌍

    }
}
