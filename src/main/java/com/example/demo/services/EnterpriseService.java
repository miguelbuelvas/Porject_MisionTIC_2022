package com.example.demo.services;

import com.example.demo.entities.Enterprise;
import com.example.demo.entities.Transaction;
import com.example.demo.repository.EnterpriseRepository;
import com.example.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Enterprise> Buscar() {
        return enterpriseRepository.findAll();
    }

    public boolean deleteById(Long id) {
        enterpriseRepository.deleteById(id);
        if (this.enterpriseRepository.findById(id).isPresent()) {
            return false;
        }
        return true;
    }

    public <S extends Enterprise> S save(S entity) {
        return enterpriseRepository.save(entity);
    }

    public Optional<Enterprise> findById(Long id) {
        return enterpriseRepository.findById(id);
    }

    public List<Transaction> findMovimentsEnterpriseByIdEnterprise(Long id) {
        List<Transaction> transactions = new ArrayList<>();
        List<Transaction> transactionsList = transactionRepository.findAll();
        for (Transaction transaction : transactionsList) {
            if (Objects.equals(transaction.getEnterprises().getId(), id)) {
                transactions.add(transaction);
            }
        }
        return transactions;
    }

    public <S extends Transaction> S saveTransaction(S entity) {
        return transactionRepository.save(entity);
    }

    public boolean deleteMovementById(Long id) {
        transactionRepository.deleteById(id);
        if (this.transactionRepository.findById(id).isPresent()) {
            return false;
        }
        return true;
    }
}
