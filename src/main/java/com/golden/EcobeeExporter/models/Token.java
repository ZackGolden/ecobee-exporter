package com.golden.EcobeeExporter.models;

import lombok.Data;

@Data
public class Token {
    private String access_token;
    private String token_type;
    private int expires_in;
    private String refresh_token;
    private String scope;
}
