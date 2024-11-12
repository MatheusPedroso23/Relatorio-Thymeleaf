package com.example.Relatorio.Service;

import com.example.Relatorio.Models.Cliente;
import com.example.Relatorio.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Método para listar todas as agendas
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    // Método para buscar uma agenda por ID
    public Optional<Cliente> findOne(Long id) {
        return clienteRepository.findById(id);
    }

    // Método para salvar ou atualizar uma agenda
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Método para deletar uma agenda por ID
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
}