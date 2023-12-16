import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
Scrivere una funzione che restituisca un hashset riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato
 */
public class Main {
    public static void main(String[] args) {
        HashSet<String> numbers = new HashSet<>(Arrays.asList("1", "345", "98"));
        numbers.add("2");
        numbers.add("3");

        System.out.println("ecco la mia lista: " + numbers);

        String newNumber = "2";

        Iterator<String> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            String number = iterator.next();
            if (newNumber.equals(number)) {
                iterator.remove();
            }
        }
        System.out.println("ecco la mia lista aggiornata: " + numbers);

        numbers.clear();

        System.out.println("visualizza contenuto lista" + numbers);

//Non so se ho ben interpretato la richiesta...
        if (numbers.isEmpty()){
            System.out.println("verifica effettuata. Lista aggiornata: elementi presenti: " + numbers.size());
        }
    }
}


