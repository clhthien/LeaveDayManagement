package APlus.LeaveDayManagement.repository;

import APlus.LeaveDayManagement.model.User;
import APlus.LeaveDayManagement.service.inter.IUserService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
    void deleteById(Long id);
}
