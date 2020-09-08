import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercices {
    public List exercice1(List<String> liste){
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont tous les éléments sont en majuscules
         */
        liste = liste.stream().map(String::toUpperCase).collect(Collectors.toList());

        return liste;
    }

    public List exercice2(List<String> liste){
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont les string "INUTILE" ont été retirées
         */

        liste = liste.stream().filter( (n) -> n.compareToIgnoreCase("INUTILE") != 0).collect(Collectors.toList());

        return liste;
    }

    public String exercice3(List<String> liste){
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une string composée
        de toutes les string de la liste concaténées
         */
        String phrase = liste.stream().collect(Collectors.joining());

        return phrase;
    }


    public String exercice4(List<String> liste){
        /*
        Utilisez les streams pour transformer la liste en paramètre de la façon suivante:
        1. Mettre tous les éléments de la liste en majuscule
        2. Retirer tous les éléments "AAA"
        3. Concaténer tous les éléments de la liste pour former une string
         */
        liste = liste.stream().filter( (n) -> n.compareToIgnoreCase("aaa") != 0).map(String::toUpperCase).collect(Collectors.toList());

        String phrase = liste.stream().collect(Collectors.joining());

        return phrase;
    }

    public List exercice5(List<Integer> liste){
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner une nouvelle liste
        dont les éléments ont été doublés
         */
        liste = liste.stream().map((n) -> n*2).collect(Collectors.toList());

        return liste;
    }

    public Integer exercice6(List<Integer> liste){
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner le produit des éléments de la liste.
         */
        Integer resultat = liste.stream().reduce((a,b) -> a*b).get();

        return resultat;
    }

    public List exercice7(List<Integer> liste){
        /*
        Utilisez les streams pour trouver tous les éléments dont le carré est supérieur à 50. Retournez une liste.
         */
        liste = liste.stream().filter( (n) -> n*n > 50).collect(Collectors.toList());

        return liste;
    }

    public List exercice8(List<Integer> liste){
        /*
        Utilisez les streams pour trouver le premier chiffre des nombres de la liste passée en paramètre lorsqu'on
         les multiplie par 9.
         */

        List<Character> nouvelleListe = liste.stream().map((n) -> n * 9).map((n) -> n.toString().charAt(0)).collect(Collectors.toList());

        return nouvelleListe;
    }

    public List exercice9(){
        /*
        Créez un stream infini d'entiers et utilisez le pour trouver les 10 premiers nombres divisibles par 3 et par 7.
         */

        List<Integer> liste = IntStream.iterate(1, (n) -> n+1).filter((n) -> n % 3 == 0 && n % 7 == 0).limit(10).boxed().collect(Collectors.toList());

        return liste;
    }

    public List exercice10(){
        /*
        Générez la liste des 20 premiers carrés parfaits grâce à un stream infini.
         */
        List<Integer> liste = IntStream.iterate(1, (n) -> n+1).map((n) -> n*n).limit(20).boxed().collect(Collectors.toList());

        return liste;
    }
}
