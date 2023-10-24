package exam02.models.member;

import exam02.commons.Validator;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class JoinService {
    @Autowired
    private Validator <Member>validator;
    @Autowired
    private MemberDao memberDao;

    /*
    public JoinService(Validator <Member> validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }
    */

    public void join(Member member) {

        validator.check(member);

        memberDao.register(member);
    }


}