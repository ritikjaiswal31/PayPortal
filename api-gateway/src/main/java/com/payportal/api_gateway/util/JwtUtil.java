package com.payportal.api_gateway.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey; // ✅ important import

public class JwtUtil {

    // Secret must be at least 32 bytes long
    private static final String SECRET = "secret123secret123secret123secret12";

    private static SecretKey getSigningKey() { // ✅ use SecretKey type
        return Keys.hmacShaKeyFor(SECRET.getBytes());
    }

    public static Claims validateToken(String token) {
        return Jwts.parser()
                .verifyWith(getSigningKey())   // ✅ SecretKey expected
                .build()
                .parseSignedClaims(token)      // ✅ correct method name
                .getPayload();                 // ✅ returns Claims
    }
}
