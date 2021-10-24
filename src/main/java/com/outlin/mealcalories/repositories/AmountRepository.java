package com.outlin.mealcalories.repositories;

import com.outlin.mealcalories.models.Amount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmountRepository extends JpaRepository<Amount, Long> {
}