package org.LLD.DesignPatterns.Structural.Adaptor.Translate.external;

import org.LLD.DesignPatterns.Structural.Adaptor.Translate.TranslationProviderAdapter;
import org.LLD.DesignPatterns.Structural.Adaptor.Translate.TranslationRequest;

import java.util.List;

public class MicrosoftTranslateApiAdapter implements TranslationProviderAdapter {

    MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();

    @Override
    public String translate(TranslationRequest translationRequest) {
        return microsoftTranslateApi.translate(translationRequest.getText(),translationRequest.getSourceLanguage(),
                translationRequest.getTargetLanguage());
    }

    @Override
    public List<String> getLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }
}
