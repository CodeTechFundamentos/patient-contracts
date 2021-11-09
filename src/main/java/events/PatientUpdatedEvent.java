package events;

import lombok.Value;

import java.util.Date;

@Value
public class PatientUpdatedEvent {
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}