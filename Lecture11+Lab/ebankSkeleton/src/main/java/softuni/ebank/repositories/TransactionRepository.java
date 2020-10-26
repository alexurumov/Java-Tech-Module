package softuni.ebank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softuni.ebank.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
