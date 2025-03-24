package org.LLD.DesignPatterns.Structural.Adaptor.Translate;

import java.util.List;

public interface TranslationProviderAdapter {

    String translate(TranslationRequest translationRequest);

    List<String> getLanguages();
}
