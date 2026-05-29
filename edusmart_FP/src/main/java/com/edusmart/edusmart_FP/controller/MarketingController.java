package com.edusmart.edusmart_FP.controller;

import com.edusmart.edusmart_FP.EdusmartFpApplication;
import com.edusmart.edusmart_FP.service.EduSmartAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketingController {

    private final EduSmartAIService aiService;

    public MarketingController(EduSmartAIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/api/edusmart/publicidad")
    public String generarPublicidad(
            @RequestParam String tema,
            @RequestParam String audiencia
    ) {

        return aiService.generarPublicidad(tema, audiencia);
    }
}