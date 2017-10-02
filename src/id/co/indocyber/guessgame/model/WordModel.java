/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author user
 */
public class WordModel {

    private String basicWord;
    private String soal;
    private String hint;
    private String jawaban;
    private String[] images;

    public WordModel() {
    }

    public WordModel(String basicWord, String hint) {
        this.basicWord = basicWord;

        this.hint = hint;
        images = new String[]{"satu.jpg", "dua.jpg"}; // contoh untuk array gambar 

    }

    /**
     * @return the basicWord
     */
    public String getBasicWord() {
        return basicWord;
    }

    /**
     * @param basicWord the basicWord to set
     */
    public void setBasicWord(String basicWord) {
        this.basicWord = basicWord;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

//    public String createSoal() {
//        setBasicWord(getBasicWord().toUpperCase());
//        // cara pertama
//        //String [] arrayOfWord = basicWord.split(basicWord);
//        String[] arrayOfWord = getBasicWord().split("");
//
//        for (int i = 0; i < arrayOfWord.length; i++) { // tidak bisa di ubah ubah
//            System.out.println(arrayOfWord[i]);
//        }
//
//        Arrays.sort(arrayOfWord);//sortir array
//        StringBuilder sb = new StringBuilder();
//        System.out.println("\nSetelah di sort");
//        for (int i = 0; i < arrayOfWord.length; i++) {
//            //System.out.println(arrayOfWord);
//            sb.append(arrayOfWord[i]);
//        }
//
//        String soal = sb.toString();
//        System.out.println("Soal yang harus dijawab " + soal);
//        return soal;
//    }
    public String createSoal() {
        setBasicWord(getBasicWord().toUpperCase());

        String[] arrayOfWord = getBasicWord().split("");

        Arrays.sort(arrayOfWord);//sortir array
        StringBuilder sb = new StringBuilder();
        System.out.println("\nSetelah di sort");
        for (int i = 0; i < arrayOfWord.length; i++) {
            //System.out.println(arrayOfWord);
            sb.append(arrayOfWord[i]);
        }

        String soal = sb.toString();
        char[] vokal = {'A', 'I', 'U', 'E', 'O'};
        for (int i = 0; i < vokal.length; i++) {
            soal = soal.replace(vokal[i], '_');         
        }
        System.out.println("Soal yang harus dijawab " + soal);
        return soal;
    }

    public String acakHuruf(){
        basicWord=basicWord.toUpperCase();
        String [] arrayOfWord=basicWord.split("");
        List<String> hurufHuruf =Arrays.asList(arrayOfWord);
        Collections.shuffle(hurufHuruf);
        
        StringBuilder sb = new StringBuilder();//String builder menggabungkan beberapa string
        for (String huruf : hurufHuruf) {
            sb.append(huruf);// sb.appen merubah karakter String [] aray ke String tunggal
        }
        String soal = sb.toString();
        char[] vokal = {'A', 'I', 'M','U','E','O'};
        for (int i = 0; i < vokal.length; i++) {
            soal = soal.replace(vokal[i], '_');
        }
        return soal;
    }
    
    /**
     * @return the jawaban
     */
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public boolean cekJawaban() {
        boolean hasil = false;
        if (jawaban.equalsIgnoreCase(basicWord)) {
            hasil = true;
        }
        return hasil;
    }
}
