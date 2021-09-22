package iuh.edu.vn.spring_boot_jwt_ldk.repository;


import iuh.edu.vn.spring_boot_jwt_ldk.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
