package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class UpdatePatientC {
    @TargetAggregateIdentifier
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
