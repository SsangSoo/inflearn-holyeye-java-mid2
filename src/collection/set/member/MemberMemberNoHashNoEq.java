package collection.set.member;

import java.util.Objects;

public class MemberMemberNoHashNoEq {

    private String id;

    public MemberMemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return "MemberMemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }

}
