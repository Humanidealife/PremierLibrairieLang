/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.premierlibrairielang;

/**
 *
 * @author wangq
 */
public class PremierLibrairieLang {

    public static void main(String[] args) {
       
        //On veut faire appel aux Class de la librairie que l'on vient de télécharger.
        //On souhaite en particulier utiliser la Class StringUtils et sa méthode "abbreviate"
        String phraseLongue = "Ceci est une phrase très longue afin de pouvoir faire un test sur la Class StringUilts de la librairie Lang";
        System.out.println(phraseLongue);
        //Puis on veut la réduire
        //Normalement, NetBeans sait où se trouve la Class StringUitls grâce au concept de "classpath"(chemin des classes)
        //  C'est-à-dire le chemin de l'ensemnble des classes dont on a besoin lors de la compilation ou 
        //  lors de l'exécution de notre code.
        //Ce concept est fondamental pou Java.
        //Le "classpath" de notre projet va contenir par défaut ce qui se trouve dans "Source Packages"
        //  mais également ce qui se trouve dans "Libraries"(mais cela n'existe plus)
        //C'est dans "Tools, Libraries, Add JAR/Folder" que nous allons référencer notre librarie "CommonsLang"
        //On peut maintenant faire "ctrl + espace" pour ajouter entre les choix "
        String phraseRaccourcie = StringUtils.abbreviate(phraseLongue, 8);
        System.out.println(phraseRaccourcie);
    }
}
