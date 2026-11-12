/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author THINKPAD
 */
public class pretest_2 {
  public static void main(String[] args) {

        int[][] nilai2D = new int[3][2];
        nilai2D[0][0] = 80;
        nilai2D[0][1] = 85;
        nilai2D[1][0] = 70;
        nilai2D[1][1] = 75;
        nilai2D[2][0] = 60;
        nilai2D[2][1] = 65;

        String[][] data = {
            {"001", "Matahari"},
            {"002", "Bintang"},
            {"003", "Bulan"}
        };

        System.out.println(data[1][1]);    
        System.out.println(nilai2D[0][1]);  
        System.out.println(data.length);    
    }
}
