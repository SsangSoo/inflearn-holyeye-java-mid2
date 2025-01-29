package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(final Member member) {
        memberMap.put(member.getId(), member);
    }

    public Member findById(final String id) {
        return memberMap.get(id);
    }

    public Member findByName(final String name) {
        // 나의 답
//        Set<Map.Entry<String, Member>> entries = memberMap.entrySet();
//        for(Map.Entry<String, Member> entiy : entries) {
//            if(entiy.getValue().getName().equals(name)) {
//                return entiy.getValue();
//            }
//        }
//        return null;

        // 영한님 답
        for(Member member : memberMap.values()) {
            if(member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public void remove(final String id) {
        memberMap.remove(id);
    }
}
