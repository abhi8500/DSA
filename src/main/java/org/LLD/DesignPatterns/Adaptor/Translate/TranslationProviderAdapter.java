package org.LLD.DesignPatterns.Adaptor.Translate;

import java.util.List;

public interface TranslationProviderAdapter {

    String translate(TranslationRequest translationRequest);

    List<String> getLanguages();
}
