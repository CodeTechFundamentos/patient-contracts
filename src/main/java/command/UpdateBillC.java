package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Value
public class UpdateBillC {
    @TargetAggregateIdentifier
    private String id;
    private Double amount;
    private String ruc;
}