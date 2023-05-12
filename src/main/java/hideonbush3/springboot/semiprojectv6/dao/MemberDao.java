package hideonbush3.springboot.semiprojectv6.dao;

import hideonbush3.springboot.semiprojectv6.model.Member;

public interface MemberDao {
    int selectLogin(Member m);
}
