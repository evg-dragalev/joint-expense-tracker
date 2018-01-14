package com.es.jointexpensetracker.service;

import com.es.jointexpensetracker.exception.DataNotFoundException;
import com.es.jointexpensetracker.model.Expense;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;
import java.util.List;

public interface ExpenseService {

    List<Expense> getExpenses();

    Expense loadExpenseById(long id) throws DataNotFoundException;

    Expense createExpense(String description, BigDecimal amount, Currency currency, String person, LocalDate date);

    void removeExpense(Expense expense);

    void save();
}
