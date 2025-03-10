package br.com.dio.service;

import br.com.dio.persistence.dao.CardRepository;
import br.com.dio.persistence.entity.CardEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<CardEntity> getAllCards() {
        return cardRepository.findAll();
    }

    public CardEntity createCard(CardEntity card) {
        return cardRepository.save(card);
    }

    public void deleteCard(Long id) {
        cardRepository.deleteById(id);
    }
}
