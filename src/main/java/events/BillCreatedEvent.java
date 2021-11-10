package events;

import lombok.Value;

import java.util.Date;

@Value
public class BillCreatedEvent {
    private String id;
    private String patientId;
    private Date billDate;
    private Double amount;
    private String ruc;
}