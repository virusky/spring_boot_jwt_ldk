package iuh.edu.vn.spring_boot_jwt_ldk.service;

import iuh.edu.vn.spring_boot_jwt_ldk.entity.Token;
import iuh.edu.vn.spring_boot_jwt_ldk.repository.TokenRepository;
import iuh.edu.vn.spring_boot_jwt_ldk.entity.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}

