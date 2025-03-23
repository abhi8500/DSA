package org.LLD.DesignPatterns.Adaptor.Translate;


import java.util.List;

public class TranslationManager {

    private TranslationProviderAdapter translateApi;


    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {

        translateApi = TranslateFactory.createTranslator(provider);
        TranslationRequest translationRequest = new TranslationRequest(text, sourceLanguage, targetLanguage, 0.0);
        return translateApi.translate(translationRequest);
    }

    public List<String> getLanguages(String provider){
        translateApi = TranslateFactory.createTranslator(provider);
        return translateApi.getLanguages();
    }
}
