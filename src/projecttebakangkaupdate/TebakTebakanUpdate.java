/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebakangkaupdate;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class TebakTebakanUpdate {
        //attribut
    int tebak; // variabel untuk angka yang ditebak pemain
    int bil; // variabel angka yang di tentukan sistem
    int score=100; // score awal pemain
    int trying=1; // variabel berapa kali pemain menebak
    //method
    void ayoTebak(){ // rumus yang dibuat sistem untuk project game tebak angka
        Random angka = new Random(); // membuat obyek untuk pemanggilan bil bulat random, obyek = "angka"
        this.bil = angka.nextInt(101); // obyek yang tadi dibuat untuk mendefinisikan attribut bil
        Scanner input = new Scanner(System.in); // membuat obyek untuk input data, obyek =  "input"
        System.out.println("hint: "+ this.bil); //hint kepada developer untuk mengetest project 
        do { // statement do-while untuk proses looping program
            System.out.print("Masukan angka tebakan anda: "); // tampilan kepada pemain untuk memasukan angka tebakannya
            this.tebak = input.nextInt(); // program agar pemain dapat menginput bil bulat
            if (this.tebak > this.bil){ // kondisi saat tebakan pemain terlalu tinggi
                System.out.println("Tebakan anda terlalu tinggi!"); // tampilan untuk pemain yang tebakannya terlalu tinggi
                this.score -= 2; // sistem mengurangi score pemain sebanyak 2 point karena jawaban pemain false
                System.out.println("score anda sekarang: " + this.score); // tampilan score pemain setelah score dikurangi
            }else if (this.tebak < this.bil){ // kondisi saat tebakan pemain terlalu rendah
                System.out.println("Tebakan anda terlalu rendah!"); // tampilan untuk pemain yang tebakannya terlalu rendah
                this.score -= 2; // sistem mengurangi score pemain sebanyak 2 point karena jawaban pemain false
                System.out.println("score anda sekarang: " + this.score); // tampilan score pemain setelah score dikurangi
            }else { // kondisi ketika tebakan pemain benar atau sesuai dengan yang ditentukan sistem
                System.out.println("YESS, Selamat tebakan anda tepat!"); // tampilan untuk pemain yang tebakannya tepat/true
                System.out.println("Score akhir anda: " + this.score ); // tampilan score akhir pemain 
                if (this.trying <= 5){ // kondisi tambahan ketika pemain dapat menebak < 5x
                    this.score += 50; // sistem menambah score akhir pemain sebanyak 50
                    System.out.println("anda mendapat score + 50 karena menebak tidak lebih dari 5 kali"); // tampilan untuk pemain karena berhasil menebak < 5x
                    System.out.println("Hasil akhir score anda: " + this.score); // tampilan score akhir pemain setelah dijumlah bonus
                }
            }this.trying += 1; // program untuk sistem menghitung berapa kali pemain menebak
        }
        while (this.tebak != this.bil); // statement do-while untuk proses looping program
    }
}

