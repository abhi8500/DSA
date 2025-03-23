package org.LLD.DesignPatterns.Adaptor.Translate.external;

import java.util.List;

import static org.LLD.DesignPatterns.Adaptor.Translate.external.ApiUtils.logGoogleGetSupportedLanguages;
import static org.LLD.DesignPatterns.Adaptor.Translate.external.ApiUtils.logGoogleTranslate;

public class GoogleTranslateApi {

    public String convert(GoogleTranslationRequest request) {
        // Implementation for translating text using Google Translate API
        logGoogleTranslate();
        return "Translated text";
    }

    public List<String> getLanguages() {
        // Implementation for fetching supported languages from Google Translate
        logGoogleGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}
