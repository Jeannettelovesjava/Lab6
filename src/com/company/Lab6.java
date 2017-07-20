package com.company;

import java.util.Scanner;

class Lab6 {

public static void main(String[] args)
{
    Scanner input = new Scanner( System.in );
    String yourSentence="";
    String[] tokens;

    do
    {
        System.out.println("Enter your words without punctuations here: ");
        yourSentence = input.nextLine();
        tokens = yourSentence.split(" ");

        String newSentence = "";

        for(String token : tokens) {
            if( token.startsWith("a") || token.startsWith("e") || token.startsWith("i") ||
                    token.startsWith("o") || token.startsWith("u"))
            {
                newSentence += token + "way ";
            }
            else
            {
                newSentence += token.substring(1) + token.substring(0,1) + "ay ";
            }
        }

        System.out.println(newSentence);

    }

    while(!yourSentence.equals("exit "));
}}
