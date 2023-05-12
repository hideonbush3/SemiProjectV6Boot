package hideonbush3.springboot.semiprojectv6boot.service;

import hideonbush3.springboot.semiprojectv6boot.model.Board;

import java.util.List;

public interface BoardService {

    List<Board> readBoard(int cpage);

    int countBoard();

    List<Board> readBoard(int cpg, String ftype, String fkey);

    int countBoard(String ftype, String fkey);

    Board readOneBoard(String bno);

    boolean newBoard(Board bd);
}
