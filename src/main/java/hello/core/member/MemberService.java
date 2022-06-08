package hello.core.member;

public interface MemberService {

    Member join(Member member);

    Member findMember(Long memberId);
}
