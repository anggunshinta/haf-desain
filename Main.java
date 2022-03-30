package com.company.praktikum3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pegawai> daftarList = new ArrayList<>();
        Manajer SiA = new Manajer ("SiA", 2489, 4000000, "Pegawai Tetap", 50);
        Staff SiB = new Staff ("SiB", 3110, 30000, "Pegawai Tidak Tetap", 40 );
        Manajer SiC = new Manajer ("SiC", 5010, 4000000, "Pegawai Tetap", 50);
        Staff SiD = new Staff ("SiD", 8110, 50000, "Pegawai Tetap", 40 );
        Manajer SiE = new Manajer ("SiE", 19010, 1500000, "Pegawai Tidak Tetap", 50);
        daftarList.add(SiA);
        daftarList.add(SiB);
        daftarList.add(SiC);
        daftarList.add(SiD);
        daftarList.add(SiE);


        for (Pegawai Pegawai:daftarList){
            System.out.println("Gaji yang didapat untuk " + Pegawai.getnamaPegawai() + " adalah " + Pegawai.getGaji());
        }



        //set-departemen
        Departemen Finance = new Departemen("Finance");
        Finance.setnamaDepartemen("Finance");


    }
}
