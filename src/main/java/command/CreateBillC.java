package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Value
public class CreateBillC {
    @TargetAggregateIdentifier
    private String id;
    private String patientId;
    private Date billDate;
    private Double amount;
    private String ruc;
}