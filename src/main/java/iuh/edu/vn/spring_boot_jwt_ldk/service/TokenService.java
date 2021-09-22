package iuh.edu.vn.spring_boot_jwt_ldk.service;

import com.example.spring_boot_api_jwt_ad.entity.Token;
import iuh.edu.vn.spring_boot_jwt_ldk.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
