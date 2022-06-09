package jana60Bonus;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int numero = 0;

    boolean valoreInvalido = true;          //boolean per controllo valore

    while (valoreInvalido) {                // ciclo per far si che l'utente inserisca un dato valido

        System.out.print("Inserisci valore tra 1 e 200: ");
        numero = scanner.nextInt();

        if (numero<1 || numero >200) {
            System.out.println("Devi inserire un valore tra 1 e 200!"+"\n");
            scanner.nextLine();

        } else {
            valoreInvalido = false;
            System.out.println("Procediamo");
            scanner.nextLine();
            scanner.nextLine();

        }
    }

    scanner.close();                                //scanner chiuso dato che l'utente non ha altri dati da inserire

    for (int i= 1 ; i <= numero ; i++) {            //esecuzione FizzBuzz

        if ((i%3==0) && (i%5==0)) {                 //check x3 e x5

            System.out.println("FizzBuzz");

        } else if (i%3==0) {                        //check x3

            System.out.println("Fizz");

        } else if (i%5==0) {                        //check x5

            System.out.println("Buzz");

        } else                                      //altri risultati

            System.out.println(i);

    }

    }
}
