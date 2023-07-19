package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.Bank;
public interface BankRepo extends JpaRepository<Bank,Integer>{

}