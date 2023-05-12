package hideonbush3.springboot.semiprojectv6boot.dao;

import hideonbush3.springboot.semiprojectv6boot.model.Member;

public interface MemberDao {
    int selectLogin(Member m);
}
