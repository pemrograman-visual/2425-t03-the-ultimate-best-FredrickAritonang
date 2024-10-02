// 12S24001-Fredrick Aritonang
// 12S24019-Winda N.V.Sitorus

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, penerbit, format, tahun, kategori, tub, diskon;
        int stok;
        double harga, margin, rating1, katdiskon;

        do {
            isbn = input.nextLine();
            if (isbn.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahun = input.nextLine();
                penerbit = input.nextLine();
                format = input.nextLine();
                harga = Double.parseDouble(input.nextLine());
                margin = Double.parseDouble(input.nextLine());
                stok = Integer.parseInt(input.nextLine());
                rating1 = Double.parseDouble(input.nextLine());
                if (rating1 >= 4.7) {
                    kategori = "Best Pick";
                } else {
                    if (rating1 >= 4.5) {
                        kategori = "Must Read";
                    } else {
                        if (rating1 >= 4.0) {
                            kategori = "Recommended";
                        } else {
                            if (rating1 >= 3.0) {
                                kategori = "Average";
                            } else {
                                if (rating1 < 3.0) {
                                    kategori = "Low";
                                } else {
                                    kategori = "";
                                }
                            }
                        }
                    }
                }
            }
            katdiskon = margin / harga * -1;
            if (katdiskon >= (double) 40 / 100) {
                diskon = "Once in a lifetime";
            } else {
                if (katdiskon > (double) 20 / 100) {
                    diskon = "Never come twice";
                } else {
                    if (katdiskon > 0) {
                        diskon = "No regret";
                    } else {
                        diskon = "_ _ _";
                    }
                }
            }
            if (kategori.equals("Best Pick") && diskon.equals("Once in a lifetime")) {
                tub = "The ultimate best";
            } else {
                tub = "---";
            }
            System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + toFixed(harga,2) + "|" + toFixed(margin,2) + "|" + stok + "|" + toFixed(rating1,1) + "|" + kategori + "|" + diskon + "|" + tub);
        } while (!isbn.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
