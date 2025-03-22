package APlus.LeaveDayManagement.repository;

import APlus.LeaveDayManagement.model.User;
import APlus.LeaveDayManagement.service.inter.IUserService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findByUsernameOrEmail(String username, String email);
    void deleteById(Long id);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
