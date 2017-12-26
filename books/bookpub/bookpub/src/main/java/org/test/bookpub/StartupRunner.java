package org.test.bookpub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;

import repository.BookRepository;

public class StartupRunner implements CommandLineRunner {
	@Autowired
	private BookRepository bookRepository;
	
	protected final Log logger = LogFactory.getLog(getClass());

	@Scheduled (initialDelay = 1000, fixedRate = 10000)
	public void run() {
		logger.info("Number of books: " + bookRepository.count());
	}

	@Override
	public void run(String... args) throws Exception {
	
		
	}
}
