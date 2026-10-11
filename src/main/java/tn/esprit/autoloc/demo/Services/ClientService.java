package tn.esprit.autoloc.demo.Services;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.demo.Repository.ClientRepository;
import tn.esprit.autoloc.demo.domain.Client;

import java.util.List;
@Service
public class ClientService implements IClientService {
 ClientRepository clientRepository;
    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        return clientRepository.findById(idClient).get();
    }

    @Override
    public void removeClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }

    @Override
    public List<Client> addClients(List<Client> clients) {
        return clientRepository.saveAll(clients);
    }
}
