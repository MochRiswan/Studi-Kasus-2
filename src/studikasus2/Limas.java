/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus2;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Limas {
    Scanner I = new Scanner(System.in);
    int pa;
    int la;
    int tl;
    double h;
    
    void masuk(){
        System.out.print("Masukkan panjang alas\t= ");
        pa = I.nextInt();
        System.out.print("Masukkan lebar alas\t= ");
        la = I.nextInt();
        System.out.print("Masukkan tinggi limas\t= ");
        tl = I.nextInt();
    }
    double rumus(){
        h = (1*pa*la*tl/3);
        return h;
    }
    double hasil(){
        System.out.print("Hasil\t\t\t= ");
        return h;
    }
}
