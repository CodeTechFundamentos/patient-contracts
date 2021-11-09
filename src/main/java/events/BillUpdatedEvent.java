package events;

import lombok.Value;

import java.util.Date;

@Value
public class BillUpdatedEvent {
    private String id;
    private Double amount;
    private String ruc;
}