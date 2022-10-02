package com.hayatitastan;

import javax.swing.*;

/**
 * Created by Dr. Hayati TASTAN on 2.10.2022
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba JAVA!");
        JOptionPane.showMessageDialog(null,"MERHABA JAVA!");
        byte byteDeger = 4;
        short shortDeger = 7;
        int integerDeger = 234;
        long longDeger = 12332;

        float floatDeger = 34.5f;
        double doubleDeger = 345.2;

        boolean dogruDeger = true;
        boolean yanlisDeger = false;

        System.out.println("Byte Değer: " + byteDeger);
        System.out.println("Short Değer: " + shortDeger);
        System.out.println("Integer Değer: " + integerDeger);
        System.out.println("Long Değer: " + longDeger);

        System.out.println("Float Deger: " + floatDeger);
        System.out.println("Double Deger: " + doubleDeger);

        System.out.println("Boolean Dogru: " + dogruDeger);
        System.out.println("Boolean Yanlis: " + yanlisDeger);

        // CHAR and STRINGS
        char charDeger1 = 65;
        char charDeger2 = 'A';

        char[] chars = {'M','e','r','h','a','b','a'};
        String stringDeger1 = new String(chars);

        String stringDeger2 = "Merhaba www.hayatitastan.com";

        System.out.println("Char Deger 1: " + charDeger1);
        System.out.println("Char Deger 2: " + charDeger2);

        System.out.println("String Değer1:" + stringDeger1);
        System.out.println("String Değer2:" + stringDeger2);

        //Farklı bir String veri tipi tanımlama yöntemi
        String stringDeger = "Merhaba www.hayatitastan.com";
        System.out.println("String Değer:" + stringDeger);

        //String değerden bir karakter çekme
        char charDeger = stringDeger.charAt(10); //Konsol Çıktısı: w
        System.out.println("10 'uncu karakter: "+ charDeger);

        //Substring kullanımı
        String substringDeger1 = stringDeger.substring(8);
        System.out.println("8 inci karakter ve sonrası: " + substringDeger1);
        //Konsol Çıktısı: www

        //Substring kullanımı
        String subStringDeger2 = stringDeger.substring(12,24);
        System.out.println("12. ve 24. karakterler arası: " +subStringDeger2);
        //Konsol Çıktısı: hayatitastan

        //Java String toUpperCase() ve toLowerCase() methodları
        System.out.println("BÜYÜK HARFE DÖNÜŞÜM: " + stringDeger.toUpperCase());
        System.out.println("küçük harfe dönüşüm: " + stringDeger.toLowerCase());

        //Java String replace() methodu
        System.out.println("com yerine com.tr: "+ stringDeger.replace("com", "com.tr"));


        //Java String equals() ve equalsIgnoreCase() methodları
        boolean durum1 = stringDeger.equals("Merhaba www.hayatitastan.com");
        System.out.println(durum1);
        // output: true

        boolean durum2 = stringDeger.equals("merhaba www.hayatitastan.com");
        System.out.println(durum2);
        // output: false

        boolean durum3 = stringDeger.equalsIgnoreCase("merhaba www.hayatitastan.com");
        System.out.println(durum3);
        // output: true

        //Java String split() methodu
        String[] stringDegerDizi = stringDeger.split(" ");
        System.out.println(stringDegerDizi[0]); //output: Merhaba
        System.out.println(stringDegerDizi[1]); //output: www.hayatitastan.com

        //Other string methods: length(), isEmpty(), concat()
        System.out.println("Uzunluk: " + stringDegerDizi.length); //output: 2
        System.out.println("Uzunluk: " + stringDeger.length()); //output: 28
        System.out.println("Boş mu: " + stringDegerDizi[0].isEmpty()); //output: false
        System.out.println(".tr eklendi: "+ stringDeger.concat(".tr")); //output: www.hayatitastan.com.tr
    }
}

