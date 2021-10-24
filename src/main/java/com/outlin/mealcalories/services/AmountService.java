package com.outlin.mealcalories.services;

import com.outlin.mealcalories.models.Amount;
import com.outlin.mealcalories.repositories.AmountRepository;
import org.springframework.stereotype.Service;

@Service
public class AmountService {

    private final AmountRepository amountRepository;

    public AmountService(AmountRepository amountRepository) {
        this.amountRepository = amountRepository;
    }

    public Amount createAmount(Amount amount) {
        return amountRepository.save(amount);
    }
}
