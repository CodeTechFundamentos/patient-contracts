package result;

import lombok.Getter;

@Getter
public class PaymentMethodUpdatedResult {
    private String id;
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

    public PaymentMethodUpdatedResult(String id, String cardType, Integer cardNumber, Integer expirationDateMonth, Integer expirationDateYear,
                               Integer securityCode, String ownerFirstname, String ownerLastname, String city, String billingAddress, String billingAddressLine2,
                               String postalCode, String country, Integer phoneNumber) {
        this.id = id;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expirationDateMonth = expirationDateMonth;
        this.expirationDateYear = expirationDateYear;
        this.securityCode = securityCode;
        this.ownerFirstname = ownerFirstname;
        this.ownerLastname = ownerLastname;
        this.city = city;
        this.billingAddress = billingAddress;
        this.billingAddressLine2 = billingAddressLine2;
        this.postalCode = postalCode;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }
}
