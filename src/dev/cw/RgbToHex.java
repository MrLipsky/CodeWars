package dev.cw;

public class RgbToHex {

    public static void main(String[] args) {

        System.out.println(rgb(255,254,16));

    }

//    Method converting RGB color values to hexadecimal values
    public static String rgb(int r, int g, int b) {

        return primaryToHex(r) + primaryToHex(g) + primaryToHex(b);
    }

    public static String primaryToHex(int p) {

        if (p > 255) {
            return  "FF";
        } else if (p <= 0) {
            return  "00";
        } else if (p < 16){
            return "0" + Integer.toHexString(p).toUpperCase();
        } else {
            return Integer.toHexString(p).toUpperCase();
        }
    }
}
