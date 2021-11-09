package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class BillUpdateResult {
    private String id;
    private Double amount;
    private String ruc;

    public BillUpdateResult(String id, Double amount, String ruc) {
        this.id = id;
        this.amount = amount;
        this.ruc = ruc;
    }
}
