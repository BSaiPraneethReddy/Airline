package com.lti.AirlineReservationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.AirlineReservationSystem.beans.Transaction;

import com.lti.AirlineReservationSystem.services.TransactionServiceImpl;

//@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
	TransactionServiceImpl TransactionService;
	
	
	// http://localhost:8090/transaction/addtransaction
		
	
	@PostMapping("/addtransaction")
		public int addTransaction(@RequestBody Transaction t) {
			return TransactionService.addTransaction(t);
		}
	
	// http://localhost:8090/transaction/transactions
	@GetMapping("/transactions")
	public List<Transaction> listAllTransaction() {
		List<Transaction> traList = TransactionService.listAllTransaction();
		return traList;

	}

	// http://localhost:8090/transaction/transactionId/60001
		@GetMapping("/transactionId/{id}")
		public Transaction findTransactionId(@PathVariable(value ="id") int Trans_id) {
			Transaction a = null;
			a = TransactionService.findTransactionId(Trans_id);
			return a;
		}
		

}
