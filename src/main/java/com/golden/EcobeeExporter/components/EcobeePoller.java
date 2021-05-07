package com.golden.EcobeeExporter.components;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EcobeePoller {


    @Scheduled(fixedRate=1000)
    public void poll() {
      System.out.println("It's Working!");     
    }

  
}
