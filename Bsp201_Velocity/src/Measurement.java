
import java.io.Serializable;
import java.time.LocalDateTime;

//Elias hat mir bei dieser HÜ geholfen, da ich Schwierigkeiten mit einigen Methoden hatte, 
//da ich nicht wusste, wie ich sie für einen Table erstellen sollte bzw. hat mir das knowhow 
//für von Java bereitgestellte Methoden gefehlt.
public class Measurement implements Serializable{
    private LocalDateTime datum;
    private String kz;
    private int vErlaubt;
    private double vGemessen;

    public Measurement(LocalDateTime datum, String kz, int vErlaubt, double vGemessen) {
        this.datum = datum;
        this.kz = kz;
        this.vErlaubt = vErlaubt;
        this.vGemessen = vGemessen;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public String getKennzeichen() {
        return kz;
    }

    public int getErlaubt() {
        return vErlaubt;
    }

    public double getGemessen() {
        return vGemessen;
    }
    
        public double berechneUebertretung(){
            if(vGemessen > vErlaubt){
                return vGemessen - (double )vErlaubt;
            }
            return 0;
        }
    
}
