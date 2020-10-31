/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebakangkaupdate;

/**
 *
 * @author Acer
 */
public class ProjectTebakAngkaUpdate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hallo, saya telah memilih sebuah bilangan bulat secara acak dari 0 s/d 100");
        System.out.println("Bisakah anda menebak angka berapa yang saya pilih?");
        
        TebakTebakanUpdate f = new TebakTebakanUpdate(); //pembuatan obyek untuk kelas TebakTebakanUpdate
        f.ayoTebak(); // perintah obyek untuk menjalankan kelas TebakTebakan
    }
    
}
