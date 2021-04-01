package expertsystem;

public class Expert {
    public boolean isAceticAcid (boolean bentukTumpahan, int nilaiPH, boolean bauTumpahan){
        
        boolean jenisTumpahan = true;
        
        if (bentukTumpahan == true && nilaiPH < 6 && bauTumpahan == true){
            jenisTumpahan = true;
        }
        return jenisTumpahan;
    }
    
}
