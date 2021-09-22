package iuh.edu.vn.spring_boot_jwt_ldk.service;

import iuh.edu.vn.spring_boot_jwt_ldk.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
