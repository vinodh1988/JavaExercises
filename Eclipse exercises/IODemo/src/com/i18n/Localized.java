package com.i18n;

import java.util.Locale;

public class Localized {
    public static void main(String n[]){
    	Locale l[]=Locale.getAvailableLocales();
    	
    	for(Locale x:l)
    	{
    		System.out.println(x);
    		System.out.println(x.getDisplayLanguage()+" "+x.getDisplayCountry());
    	}
    }
    
}
