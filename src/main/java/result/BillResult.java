package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class BillResult {
    private String id;
    private Integer patientId;
    private Date billDate;
    private Double amount;
    private String ruc;

    public BillResult(String id, Integer patientId, Date billDate, Double amount, String ruc) {
        this.id = id;
        this.patientId = patientId;
        this.billDate = billDate;
        this.amount = amount;
        this.ruc = ruc;
    }
}
