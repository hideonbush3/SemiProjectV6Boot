package hideonbush3.springboot.semiprojectv6boot.dao;

import hideonbush3.springboot.semiprojectv6boot.model.Member;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("mdao")
public class MemberDaoImpl implements MemberDao{
    @Autowired
    private SqlSession sqlSession;

    @Override
    public int selectLogin(Member m) {
        return sqlSession.selectOne("member.selectLogin", m);
    }
}
