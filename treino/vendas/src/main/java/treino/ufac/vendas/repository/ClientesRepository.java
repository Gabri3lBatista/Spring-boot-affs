package treino.ufac.vendas.repository;

import org.springframework.stereotype.Repository;

import treino.ufac.vendas.modal.Cliente;

//Cliente repository é uma dependencia do cliente service
@Repository
public class ClientesRepository {
    public void persistir(Cliente cliente){
        //acessa base e salva o cliente
    }
}
