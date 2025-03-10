package br.com.dio.service;

import br.com.dio.persistence.dao.BoardRepository;
import br.com.dio.persistence.entity.BoardEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<BoardEntity> getAllBoards() {
        return boardRepository.findAll();
    }

    public BoardEntity createBoard(BoardEntity board) {
        return boardRepository.save(board);
    }

    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }
}
