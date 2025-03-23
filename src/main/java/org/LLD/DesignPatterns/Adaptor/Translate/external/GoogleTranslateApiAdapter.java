package org.LLD.DesignPatterns.Adaptor.Translate.external;

import org.LLD.DesignPatterns.Adaptor.Translate.TranslationProviderAdapter;
import org.LLD.DesignPatterns.Adaptor.Translate.TranslationRequest;

import java.util.List;

public class GoogleTranslateApiAdapter implements TranslationProviderAdapter {

    GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();

    @Override
    public String translate(TranslationRequest translationRequest) {
        GoogleTranslationRequest googleTranslationRequest = new GoogleTranslationRequest(translationRequest.getText(),translationRequest.getSourceLanguage(),
                translationRequest.getTargetLanguage(), translationRequest.getConfidenceThreshold());
        return googleTranslateApi.convert(googleTranslationRequest);
    }

    @Override
    public List<String> getLanguages() {
        return googleTranslateApi.getLanguages();
    }
}
