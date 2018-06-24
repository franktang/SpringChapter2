package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    @Bean(name="lonelyHeartsClubBand")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

//    @Bean
//    public CDPlayer cdPlayer() {
//        return new CDPlayer(sgtPeppers());
//    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc cd){
        return new CDPlayer(cd);
    }
}
