package sdm;

public class Karyawan {
    public int hitungGaji (int gajiSebelumPPH, double PPH, int PTKP){
        int gajiSetelahPPH = gajiSebelumPPH;
        if (gajiSebelumPPH >= 5_000_000)
        {
            gajiSetelahPPH = (int) (gajiSebelumPPH - (gajiSebelumPPH * PPH));
        }
        return gajiSetelahPPH;     
    }


public int hitungPPH (int gajiSebelumPPH, double PPH, int PTKP){
        int nilaiPPHdibayarkan = gajiSebelumPPH;
        if (nilaiPPHdibayarkan >= 5_000_000)
        {
            nilaiPPHdibayarkan = (int) (gajiSebelumPPH - (gajiSebelumPPH * PPH));
        }
        return nilaiPPHdibayarkan;     
    }
}