package org.LLD.DesignPatterns.Structural.Adaptor.Translate;

import org.LLD.DesignPatterns.Structural.Adaptor.Translate.external.GoogleTranslateApiAdapter;
import org.LLD.DesignPatterns.Structural.Adaptor.Translate.external.MicrosoftTranslateApiAdapter;

public class TranslateFactory {

    public static  TranslationProviderAdapter createTranslator(String provider){

        if (provider.equals("google")){
            return new GoogleTranslateApiAdapter();
        } else if (provider.equals("microsoft")) {
            return new MicrosoftTranslateApiAdapter();
        }else {
            throw new RuntimeException("Invalid provider");
        }
    }
}
