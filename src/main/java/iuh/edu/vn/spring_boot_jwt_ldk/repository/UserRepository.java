package iuh.edu.vn.spring_boot_jwt_ldk.repository;

import iuh.edu.vn.spring_boot_jwt_ldk.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
