package com.doctors.app.services.security;

import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.doctors.app.dataBase.patients.Patient;
import com.doctors.app.dataBase.patients.PatientRepository;
import com.doctors.app.util.Config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JWT {
  public static String generateToken(Integer patientId) {
    Date exp = new Date(Config.getExpirationTime() + System.currentTimeMillis());

    return Jwts.builder().setExpiration(exp).setSubject(Integer.toString(patientId))
        .signWith(SignatureAlgorithm.RS256, Config.getSecret()).compact();
  }

  public static Patient getAuth(String token) {
    PatientRepository database = new PatientRepository();
    try {
      Claims claims = Jwts.parser().setSigningKey(Config.getSecret().getBytes()).parseClaimsJws(token).getBody();

      Integer patienId = Integer.parseInt(claims.getSubject());

      Optional<Patient> patient = database.getById(patienId);

      if (patient.isPresent()) {
        return patient.get();
      }
      return null;

    } catch (JwtException e) {
      return null;
    } catch (NumberFormatException e) {
      return null;
    }
  }
}
