import java.sql.Timestamp;

public class ArchiveData {

    private String clientName;
    private int amountBeforeTaxation;
    private int amountAfterTaxation;
    private String taxationType;
    private Timestamp timestamp;

    ArchiveData(String clientName, int amountBeforeTaxation,int amountAfterTaxation, String taxationType, Timestamp timestamp){
    this.clientName = clientName;
    this.amountBeforeTaxation = amountBeforeTaxation;
    this.amountAfterTaxation = amountAfterTaxation;
    this.taxationType = taxationType;
    this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ArchiveData{" +
                "clientName='" + clientName + '\'' +
                ", amountBeforeTaxation=" + amountBeforeTaxation +
                ", amountAfterTaxation=" + amountAfterTaxation +
                ", taxationType='" + taxationType + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
