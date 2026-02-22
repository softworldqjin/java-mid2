package collection.set.member;

import java.util.Objects;

public class Member {
    private String id;

    public String getId() {
        return id;
    }

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) { // 버킷 안에 들어가서 요소가 같은지 확인해서 같으면 추가 안함
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() { // 이걸로 버킷 배열에 몇번째 들어갈지 판단
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
