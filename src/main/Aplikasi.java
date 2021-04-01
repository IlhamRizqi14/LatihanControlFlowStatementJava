package main;

import pembayaran.Pembayaran;
import sdm.Karyawan; //ini harus ditambahkan, karena class Karyawan berbeda package dengan class Aplikasi
import billing.Customer;
import expertsystem.Expert;
import alarmsystem.Alarm;


public class Aplikasi { //jadi semua code di java itu ada didalam class. Class ini namanya class Aplikasi. Class itu punya anak buah
    //method dan field. kita masih bahas method. Contoh method itu ini ham. Yang saya blok. method itu mengerjakan sejumlah
    //statement. oh iya, uji coba itu, semuanya berada didalam method main
    //untuk tugas saya, setelah uji coba latihan1 selesai, code-codenya dibuat comment. contoh

    public static void main(String[] args) { //<-- ini, yang ini melekat di method main
        //semua code uji coba harus berada diantara tanda { dan }
        //yang latihan 2 nanti kamu ketik di sini



//LATIHAN 6 if-then statement
//        Alarm alarm = new Alarm();
//        
//        boolean statusAlarmWarning;
//        
//        //test case 1
//        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, true, true);
//        System.out.println(statusAlarmWarning);
//        
//        //test case 2
//        statusAlarmWarning = alarm.isAlarmStatusWarning(60, true, true);
//        System.out.println(statusAlarmWarning);
//        
//        //test case 3
//        statusAlarmWarning = alarm.isAlarmStatusWarning(40, true, true);
//        System.out.println(statusAlarmWarning);
//        
//        //test case 4
//        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, false, true);
//        System.out.println(statusAlarmWarning);
//        
//        //test case 5
//        statusAlarmWarning = alarm.isAlarmStatusWarning(60, false, true);
//        System.out.println(statusAlarmWarning);
//        
//        //test case 6
//        statusAlarmWarning = alarm.isAlarmStatusWarning(40, false, true);
//        System.out.println(statusAlarmWarning);
//        
//        //test case 7
//        statusAlarmWarning = alarm.isAlarmStatusWarning(55.5, false, false);
//        System.out.println(statusAlarmWarning);
//        
//        //test case 8
//        statusAlarmWarning = alarm.isAlarmStatusWarning(60, false, false);
//        System.out.println(statusAlarmWarning);
//        
//        //test case 9
//        statusAlarmWarning = alarm.isAlarmStatusWarning(40, false, false);
//        System.out.println(statusAlarmWarning);



//LATIHAN 5 if-then statement
//        Expert expert = new Expert();
//        
//        boolean jenisTumpahan;
//        
//        //test case 1
//        jenisTumpahan = expert.isAceticAcid(true, 5, true);
//        System.out.println(jenisTumpahan);
//        
//        //test case 2
//        jenisTumpahan = expert.isAceticAcid(true, 6, true);
//        System.out.println(jenisTumpahan);
//        
//        //test case 3
//        jenisTumpahan = expert.isAceticAcid(true, 7, true);
//        System.out.println(jenisTumpahan);
//        
//        //test case 4
//        jenisTumpahan = expert.isAceticAcid(true, 5, false);
//        System.out.println(jenisTumpahan);
//        
//        //test case 5
//        jenisTumpahan = expert.isAceticAcid(true, 6, false);
//        System.out.println(jenisTumpahan);
//        
//        //test case 6
//        jenisTumpahan = expert.isAceticAcid(true, 7, false);
//        System.out.println(jenisTumpahan);
//        
//        //test case 7
//        jenisTumpahan = expert.isAceticAcid(false, 5, true);
//        System.out.println(jenisTumpahan);
//        
//         //test case 8
//        jenisTumpahan = expert.isAceticAcid(false, 6, true);
//        System.out.println(jenisTumpahan);
//        
//         //test case 9
//        jenisTumpahan = expert.isAceticAcid(false, 7, true);
//        System.out.println(jenisTumpahan);
        
        
        
//LATIHAN 4 if-then statement
//        Customer customer = new Customer();
//        
//        int nilaiTagihanPembayaranSetelahDenda;
//        
//        //test case 1
//        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(400000, 0.01, 1, 4);
//        System.out.println(nilaiTagihanPembayaranSetelahDenda);
//        
//        //test case 2
//        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(300000, 0.01, 1, 3);
//        System.out.println(nilaiTagihanPembayaranSetelahDenda);
//        
//        
        

//LATIHAN 3 if-then statement
//        Karyawan karyawan = new Karyawan();
//        
//        int nilaiPPHdibayarkan;
//        
//        //test case 1
//        nilaiPPHdibayarkan = karyawan.hitungPPH(6000000, 0.1, 6000000);
//        System.out.println(nilaiPPHdibayarkan);
//        
//        //test case 2
//        nilaiPPHdibayarkan = karyawan.hitungPPH(4000000, 0.1, 3000000);
//        System.out.println(nilaiPPHdibayarkan);
//        
//        //test case 3
//        nilaiPPHdibayarkan = karyawan.hitungPPH(500000, 0.1, 1000000);
//        System.out.println(nilaiPPHdibayarkan);
//         
        
        
//LATIHAN2 if-then statement
//        Karyawan karyawan = new Karyawan ();
//        
//        int gajiSetelahPPH;
//        
//        //test case 1 
//        gajiSetelahPPH = karyawan.hitungGaji (6000000, 0.1, 6000000);
//        System.out.println(gajiSetelahPPH);
//        
//        //test case 2
//        gajiSetelahPPH = karyawan.hitungGaji (4000000, 0.1, 3000000);
//        System.out.println(gajiSetelahPPH);
//        
//        //tst case 3
//        gajiSetelahPPH = karyawan.hitungGaji (500000, 0.1, 1000000);
//        System.out.println(gajiSetelahPPH);
//        

//LATIHAN 1 if-then statement
//        Pembayaran pembayaran = new Pembayaran();
//       
//        int nilaiYangDibayarkan ;
//       
//        //test case 1 
//        nilaiYangDibayarkan = pembayaran.hitungPembayaran(6000000, 0.05); 
//        System.out.println(nilaiYangDibayarkan);
//
//        //test case 2
//        nilaiYangDibayarkan = pembayaran.hitungPembayaran(4000000, 0.05); 
//        System.out.println(nilaiYangDibayarkan);
//        
//        //test case 3
//        nilaiYangDibayarkan = pembayaran.hitungPembayaran(5000000, 0.05); 
//        System.out.println(nilaiYangDibayarkan);
    } //<-- ini juga
//kamu gak boleh menaruh code untuk uji coba setelah tanda }
} //<-- ini melekat di class Aplikasi, bukan di method main