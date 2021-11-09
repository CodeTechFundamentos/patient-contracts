package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class CreatePaymentMethodC {
    @TargetAggregateIdentifier
    private String id;
    private Integer patientId;
    private String cardType;
    private Integer cardNumber;
    private Integer expirationDateMonth;
    private Integer expirationDateYear;
    private Integer securityCode;
    private String ownerFirstname;
    private String ownerLastname;
    private String city;
    private String billingAddress;
    private String billingAddressLine2;
    private String postalCode;
    private String country;
    private Integer phoneNumber;
}