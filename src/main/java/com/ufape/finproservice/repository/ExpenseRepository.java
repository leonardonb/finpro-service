package com.ufape.finproservice.repository;

import com.ufape.finproservice.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByUserId(Long userId);

    List<Expense> findByDateBetween(LocalDate startDate, LocalDate endDate);

    List<Expense> findByUserIdAndDateBetween(Long userId, LocalDate startDate, LocalDate endDate);

    List<Expense> findByPaymentDestination(String paymentOrigin);

    List<Expense> findByUserIdAndPaymentDestination(Long userId, String paymentDestination);

    // Quando descomentar a categoria na entidade:
    // List<ExpenseEntity> findByExpenseCategoryId(Long categoryId);
    // List<ExpenseEntity> findByUserIdAndExpenseCategoryId(Long userId, Long categoryId);
}