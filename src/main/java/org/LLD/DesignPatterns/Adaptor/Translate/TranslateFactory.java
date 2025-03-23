package org.LLD.DesignPatterns.Adaptor.Translate;

import org.LLD.DesignPatterns.Adaptor.Translate.external.GoogleTranslateApiAdapter;
import org.LLD.DesignPatterns.Adaptor.Translate.external.MicrosoftTranslateApiAdapter;

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
