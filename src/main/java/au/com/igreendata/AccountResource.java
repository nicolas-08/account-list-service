package au.com.igreendata;

import au.com.igreendata.model.Account;
import au.com.igreendata.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/rest/account-list/server")
public class AccountResource {

	@Autowired
	private AccountRepository accountRepository;
	
	//@GetMapping("/account-list")
	@GetMapping
	public List<Account> getAccountList() {

		return accountRepository.findAll();
	}

}
