package pl.zmt.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.zmt.reader.entities.*;

@Component
public class Start {

    private UserRepository userRepository;
    private CompressorRepository compressorRepository;

    @Autowired
    public Start(UserRepository userRepository, CompressorRepository compressorRepository) {
        this.userRepository = userRepository;
        this.compressorRepository = compressorRepository;
    }

    @EventListener(ApplicationReadyEvent.class)   // Autorun funkcji po załadowaniu programu
    public void runExample() {
        User user = new User("jan_k","difficultWord", "Jan", "Kowalski", UserRole.GUEST);
        User user2 = new User("adam_n","veryDifficultWord", "Adam", "Nowak", UserRole.GUEST);

        userRepository.save(user);
        userRepository.save(user2);

        Compressor compressor = new Compressor("NO1234","Atlas Copco", "Hala 2", 3, 15, 7, CompressorType.WITH_INVERTER);
        compressorRepository.save(compressor);

    }
}
