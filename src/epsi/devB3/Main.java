package epsi.devB3;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entrez votre nom : ");
        String name = sc.nextLine();
        int nb = sc.nextInt();
        System.out.println("Bienvenue " + name);
    }
}
