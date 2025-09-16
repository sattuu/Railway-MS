package com.rms.admin.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;

public class JWTUtils {

	private static final String SECRET_KEY = "mySecretKey123456789";

	public static Claims validateToken(String token) {
		try {
			return Jwts.parserBuilder().setSigningKey(SECRET_KEY.getBytes()).build().parseClaimsJws(token).getBody();
		} catch (ExpiredJwtException e) {
			throw new RuntimeException("JWT expired", e);
		} catch (UnsupportedJwtException e) {
			throw new RuntimeException("Unsupported JWT", e);
		} catch (MalformedJwtException e) {
			throw new RuntimeException("Malformed JWT", e);
			// } catch (SignatureException e) {
			// throw new RuntimeException("Invalid signature", e);
		} catch (IllegalArgumentException e) {
			throw new RuntimeException("Empty or null JWT", e);
		}
	}
}
