package ch.pjordan;

import org.immutables.value.Value;

@Value.Immutable
public abstract class SecretInformation {
    
    @Value.Parameter
    public abstract String information();
    
    @Override
    public String toString() {
        return "*****";
    }
    
}
