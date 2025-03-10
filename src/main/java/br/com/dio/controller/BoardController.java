package br.com.dio.controller;

import br.com.dio.persistence.entity.BoardEntity;
import br.com.dio.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/boards")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public List<BoardEntity> getAllBoards() {
        return boardService.getAllBoards();
    }

    @PostMapping
    public BoardEntity createBoard(@RequestBody BoardEntity board) {
        return boardService.createBoard(board);
    }

    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
    }
}
