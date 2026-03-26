package helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import helpdesk.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}