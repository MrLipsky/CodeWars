package dev.cw;

public class RgbToHex {

    public static void main(String[] args) {

        System.out.println(rgb(255,254,16)); // equals to FFFE10 in hexadecimal
        System.out.println(rgb(255,255,255)); // equals to FFFFFF in hexadecimal
        System.out.println(rgb(0,0,0)); // equals to 000000 in hexadecimal

    }

//    Method converting RGB color values to hexadecimal values
    public static String rgb(int r, int g, int b) {

        return String.format("%02x%02x%02x", r, g, b).toUpperCase();
    }

}
