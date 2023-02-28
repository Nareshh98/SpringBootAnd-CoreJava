package com.bank.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.Entity.Accounts;


@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {

   Optional<Accounts> findByAccountNumber(long fromAccountNum);
   Optional<Accounts> findById(Long accountId);
   
   
   
   

}
 

