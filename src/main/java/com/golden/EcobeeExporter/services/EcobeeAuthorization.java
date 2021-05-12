package com.golden.EcobeeExporter.services;

import java.time.Instant;

import com.golden.EcobeeExporter.models.Authorization;
import com.golden.EcobeeExporter.models.Token;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class EcobeeAuthorization {

  public static final String ECOBEE_AUTHORIZE_ENDPOINT = "https://api.ecobee.com/authorize";
  public static final String ECOBEE_TOKEN_ENDPOINT = "https://api.ecobee.com/token";

  WebClient authClient = WebClient.builder()
    .baseUrl(ECOBEE_AUTHORIZE_ENDPOINT)
    .build();

  WebClient tokenClient = WebClient.builder()
    .baseUrl(ECOBEE_TOKEN_ENDPOINT)
    .build();

    private Authorization authorization;


  public Authorization getAuthorization() {
    if (this.authorization != null) {
      return authorization;
    }

    Instant startTime = Instant.now().plusSeconds(600);
    while(Instant.now().isAfter(startTime)) {
    }

    return null;
  }
  
}
