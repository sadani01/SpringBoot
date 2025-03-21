import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
@Profile("dev")
public class DevProfile {

    @Value("${jwt.pluto}")
    private String pluto;

    @PostConstruct
    void stampaPluto(){
        System.out.println("STAMPA:" + this.pluto);
    }
}
