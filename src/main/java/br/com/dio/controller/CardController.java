package br.com.dio.controller;

import br.com.dio.persistence.entity.CardEntity;
import br.com.dio.service.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<CardEntity> getAllCards() {
        return cardService.getAllCards();
    }

    @PostMapping
    public CardEntity createCard(@RequestBody CardEntity card) {
        return cardService.createCard(card);
    }

    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable Long id) {
        cardService.deleteCard(id);
    }
}
