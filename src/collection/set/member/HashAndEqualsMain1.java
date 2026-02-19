package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq e1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq e2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = " + e1.hashCode());
        System.out.println("m1.hashCode() = " + e2.hashCode());
        System.out.println("m1.hashCode() = " + e1.equals(e2)); // 자바에서 equals는 == 비교임

        set.add(e1);
        set.add(e2);
        System.out.println(set);

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println(searchValue.hashCode());
        System.out.println(set.contains(searchValue));
    }
}
