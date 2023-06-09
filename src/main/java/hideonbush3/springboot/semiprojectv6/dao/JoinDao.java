package hideonbush3.springboot.semiprojectv6.dao;

import hideonbush3.springboot.semiprojectv6.model.Member;
import hideonbush3.springboot.semiprojectv6.model.Zipcode;

import java.util.List;

public interface JoinDao {
    List<Zipcode> selectZipcode(String dong);

    int insertMember(Member m);

    int selectOneUserid(String uid);

    int selectOneMember(Member m);
}
