package treino.ufac.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Configuracoes {

    @Bean(name="aplicationName")
    public String aplicationName(){
        return "Sistema de Vendas";
    }

    
    
}
