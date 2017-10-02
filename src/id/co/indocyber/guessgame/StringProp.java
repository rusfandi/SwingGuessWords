
package id.co.indocyber.guessgame;

/**
 *
 * @author user
 */
public class StringProp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String nama = "Matt Robin";
//        char idx5 = nama.charAt(5); // mencari index/baris string
//        System.out.println(idx5);
//
//        int uni5 = nama.codePointAt(5); //kode pointer untukmencari nilai uniqe code
//        System.out.println(uni5);
//
//        int a = 'c';
//        char d = 10009;
//        System.out.println(Character.getNumericValue('R')); // karakter menggunakan kutip 1
            
          String nama = "Matt Robin";
          System.out.println(nama.indexOf('c'));
          System.out.println(nama.lastIndexOf('c'));
          nama=nama.replace('t', 'z'); // replace ,mengganti huruf index
          System.out.println(nama);
          char [] vokal={'a','i','u','e','o'};
          for (int i = 0; i < vokal.length; i++){
                nama = nama.replace(vokal[i], '_');
//            if(nama.indexOf(vokal.[i])==-1){
//                
//            }else {
//                int idx = nama.indexOf(vocal[i]);
            }
          System.out.println(nama);
    }

    }
