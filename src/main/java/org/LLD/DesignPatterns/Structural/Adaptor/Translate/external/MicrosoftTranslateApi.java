package org.LLD.DesignPatterns.Structural.Adaptor.Translate.external;

import java.util.List;

import static org.LLD.DesignPatterns.Structural.Adaptor.Translate.external.ApiUtils.logMicrosoftGetSupportedLanguages;
import static org.LLD.DesignPatterns.Structural.Adaptor.Translate.external.ApiUtils.logMicrosoftTranslate;

public class MicrosoftTranslateApi {

    public String translate(String text, String sourceLanguage, String targetLanguage) {
        // Implementation for translating text using Microsoft Translator API
        logMicrosoftTranslate();
        return "Translated text";
    }

    // Method to retrieve the list of supported languages from Microsoft Translator
    public List<String> getSupportedLanguages() {
        // Implementation for fetching supported languages from Microsoft Translator
        logMicrosoftGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}
