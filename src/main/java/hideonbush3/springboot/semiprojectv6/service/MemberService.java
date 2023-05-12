package hideonbush3.springboot.semiprojectv6.service;

import hideonbush3.springboot.semiprojectv6.model.Member;

import javax.servlet.http.HttpSession;

public interface MemberService {

    boolean checkLogin(Member m, HttpSession sess);


}
