package APlus.LeaveDayManagement.repository;

import APlus.LeaveDayManagement.model.User;
import APlus.LeaveDayManagement.service.inter.IUserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
    void deleteById(Long id);
    @Query("SELECT COUNT(u) > 0 FROM User u WHERE u.email = :email")
    boolean existsByEmail(@Param("email") String email);
    Optional<User> findByEmail(String email);
}
