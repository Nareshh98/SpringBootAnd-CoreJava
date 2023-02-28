package com.bank.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.Entity.Accounts;
import com.bank.Entity.FundsTransfer;
import com.bank.Repository.AccountRepository;
import com.bank.exceptions.ResourceNotFoundException;
import com.bank.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;
	@Autowired
	AccountRepository accountRepository;

	@GetMapping("/hello")
	public String hello() {
		return "Hello AccountController";
	}

	@PostMapping("/account")
	public ResponseEntity<Accounts> CreateAccount(@RequestBody Accounts accounts) throws ResourceNotFoundException {
		Accounts account = accountService.Createaccount(accounts);
		return new ResponseEntity<Accounts>(account, HttpStatus.OK);
	}

	@GetMapping("/account")
	public List<Accounts> GetAllAccounts() {
		return accountService.getAllaccounts();
	}

	@GetMapping("/account/{accountId}")
	public Accounts GetAccounts(@PathVariable("accountId") Long accountId) {
		return accountService.getByAccountId(accountId);
	}

	@PutMapping("/account/{id}")
	public ResponseEntity<Accounts> UpdateAccount(@PathVariable("id") Long accountId, @RequestBody Accounts accounts) {

		Optional<Accounts> Accounts = accountRepository.findById(accountId);
//Accounts account=Accounts.get();
		if (Accounts.isPresent()) {
			return new ResponseEntity<>(accountRepository.save(accounts), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/account/{accountId}")
	public void Delete(@PathVariable("accountId") Long accountId) {
		accountService.DeleteAccount(accountId);

	}

	@PutMapping("/fundsTransfer")
	public FundsTransfer transferAmount(@RequestBody FundsTransfer fundsTransfer) throws Exception {

		return accountService.transferAmount(fundsTransfer);
	}

}
