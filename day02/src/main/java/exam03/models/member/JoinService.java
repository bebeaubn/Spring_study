package exam03.models.member;

import exam02.commons.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JoinService {
    @Autowired
    @Qualifier("MemberDao")
    private Validator <Member> validator;
    @Autowired
    @Qualifier("mDao")
    private MemberDao memberDao3;

    public void join(Member member) {

        validator.check(member);

        memberDao3.register(member);
    }


}