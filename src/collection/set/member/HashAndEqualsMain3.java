package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member e1 = new Member("A");
        Member e2 = new Member("A");
        System.out.println("e1.hashCode() = " + e1.hashCode());
        System.out.println("e2.hashCode() = " + e2.hashCode());
        System.out.println("m1.hashCode(e2) = " + e1.equals(e2)); // 자바에서 오버라이딩안했으면 equals는 == 비교임

        set.add(e1);
        set.add(e2);
        System.out.println(set);

        // 검색 실패
        Member searchValue = new Member("A");
        System.out.println(searchValue.hashCode());
        System.out.println(set.contains(searchValue));
    }
}
