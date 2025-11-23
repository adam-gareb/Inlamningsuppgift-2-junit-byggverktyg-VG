package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.models.Book;
import se.yrgo.models.Customer;
import se.yrgo.models.Loan;
import se.yrgo.utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

    Book loanedBook = new Book(333, "The Great Book", "Tristan Kennedy", "413-123-1988", "", 598);

    Customer customerCasper = new Customer("A customer", "Casper", "Jackson", "Jordan St. 1103", "0738491847", "casperjackson@outlook.com", 1, GenderType.MALE);

    Loan loan = new Loan(333, customerCasper, loanedBook);

	//VG
	@Test
	public void testDueDate() {
    LocalDate today = LocalDate.now();
    assertEquals(today.plusDays(14), loan.getDueDate());
   }
}