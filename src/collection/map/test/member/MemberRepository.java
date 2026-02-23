package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public Member findById(String id) {
//        if (memberMap.containsKey(id)) {
//            return memberMap.get(id);
//        }
//        return null;

        return memberMap.getOrDefault(id, null);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }
}
