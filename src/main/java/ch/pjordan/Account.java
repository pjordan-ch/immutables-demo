package ch.pjordan;

import org.immutables.value.Value;

@Value.Immutable
public interface Account {

    String entityCode();

    SecretInformation clientName();
    
}
