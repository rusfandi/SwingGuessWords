/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame.model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Misbahul Munir
 */
public class WordQuestionGenerator {

    public static WordModel[] createQuestion() {
        WordModel soal1 = new WordModel("Pondok indah", "Daerah Dijakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan Utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani", "Patung Deket Monas");
        WordModel soal4 = new WordModel("Citos", "Mall Dijakarta Selatan");
        WordModel soal5 = new WordModel("Gandaria City", "Mall Anak Muda");
        WordModel[] bankSoal = {soal1, soal2, soal3, soal4, soal5};
        return bankSoal;
    }
    
    public static List<WordModel> createQuestionCollections(){
        WordModel soal1 = new WordModel("Pondok indah", "Daerah Dijakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan Utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani", "Patung Deket Monas");
        WordModel soal4 = new WordModel("Citos", "Mall Dijakarta Selatan");
        WordModel soal5 = new WordModel("Gandaria City", "Mall Anak Muda");
        List<WordModel> bankSoal=new ArrayList<>();
        bankSoal.add(soal1);
        bankSoal.add(soal2);
        bankSoal.add(soal3);
        bankSoal.add(soal4);
        bankSoal.add(soal5);
        return bankSoal;
        
    }

    
}
