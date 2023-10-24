package exam02.models.member;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InfoService {

@Autowired
    private MemberDao memberDao;

    public InfoService(){
        this.memberDao=memberDao;

    }

    public void print(){
        List<Member>members = memberDao.gets();
        members.stream().forEach(System.out::println);
    }
}
