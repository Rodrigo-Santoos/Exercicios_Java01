
package com.mycompany.indiomasistema;

import java.util.Locale;

public class IndiomaSistema {

    public static void main(String args[]) {
      Locale loc  = Locale.getDefault();
        System.out.print("A Linguegem do Sistema é:");
        System.out.print(loc.getDisplayLanguage( ));
        System.out.print(loc.getLanguage());
    }
}
