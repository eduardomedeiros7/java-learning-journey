package desafiosbasicos;

import java.util.Scanner;


public class ComprimentoDaPalavra {
    public static void main(String[] args) {
        String userWord;
        Scanner input = new Scanner(System.in);

        System.out.println("Write a word:");
        userWord = input.next();
        if (userWord.length() > 5){
            System.out.println(userWord + " It has more than 5 characters");
        }else{
            System.out.println(userWord + " Has 5 characters or less");
        }



    }
}
