package com.golden.EcobeeExporter.models;

import lombok.Data;

@Data
public class Authorization {
       private String ecobeePin;
       private String code;
       private String scope;
       private int expires_in;
       private int interval;
}
