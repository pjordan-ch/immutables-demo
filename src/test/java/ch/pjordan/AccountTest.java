package ch.pjordan;

import static java.lang.String.*;
import static java.lang.System.*;
import static org.assertj.core.api.StrictAssertions.*;

import org.junit.Test;

public class AccountTest {
    
    ImmutableSecretInformation napoleon = ImmutableSecretInformation.of("Napoléon Bonaparte");

    ImmutableSecretInformation jules = ImmutableSecretInformation.of("Jules Cesar");

    ImmutableAccount account1 = ImmutableAccount.builder()
            .entityCode("LOC")
            .clientName(napoleon)
            .build();

    ImmutableAccount account2 = ImmutableAccount.builder()
            .entityCode("LOC")
            .clientName(jules)
            .build();

    ImmutableAccount account3 = ImmutableAccount.builder()
            .entityCode("LOC")
            .clientName(napoleon)
            .build();

    @Test
    public void testNotEqual() throws Exception {
        out.println(format("Testing\n\t%s\nis equal to\n\t%s\n", account1, account2));
        assertThat(account1).isNotEqualTo(account2);
    }

    @Test
    public void testEqual() throws Exception {
        out.println(format("Testing\n\t%s\nis not equal to\n\t%s\n", account1, account3));
        assertThat(account1).isEqualTo(account3);
    }
    
}