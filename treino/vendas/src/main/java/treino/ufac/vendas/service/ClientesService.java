package treino.ufac.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import treino.ufac.vendas.modal.Cliente;
import treino.ufac.vendas.repository.ClientesRepository;

//Nessa camada atribuimos as ações, essas ações
//Essas ações sao direcionadas ao repositorio
//que altera no banco de dados
@Service
public class ClientesService {
    
    ///estanciando o repositorio no service
    
    ClientesRepository repository = new ClientesRepository();

    //spring usa essa tag para relacionar as 
    @Autowired
    public ClientesService ( ClientesRepository repository){
        this.repository = repository;
    }

  
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        //primeiro valida o cliente
       this.repository.persistir(cliente);

        
    }

    public void validarCliente(Cliente cliente){
        //aplicar cliente
    }
}
