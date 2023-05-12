package hideonbush3.springboot.semiprojectv6boot.dao;

import hideonbush3.springboot.semiprojectv6boot.model.Board;

import java.util.List;
import java.util.Map;

public interface BoardDAO {
    List<Board> selectBoard(int stbno);

    List<Board> selectBoard(Map<String, Object> params);

    int countBoard();

    int countBoard(Map<String, Object> params);

    Board selectOneBoard(String bno);

    int insertBoard(Board bd);
}