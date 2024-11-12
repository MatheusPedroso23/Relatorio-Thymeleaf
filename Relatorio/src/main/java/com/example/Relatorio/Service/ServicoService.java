package com.example.Relatorio.Service;

import com.example.Relatorio.Models.Servico;
import com.example.Relatorio.Models.Agenda;
import com.example.Relatorio.Models.Funcionario;
import com.example.Relatorio.Models.Cliente;
import com.example.Relatorio.Repository.ServicoRepository;
import com.example.Relatorio.Repository.AgendaRepository;
import com.example.Relatorio.Repository.FuncionarioRepository;
import com.example.Relatorio.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    @Autowired
    private AgendaRepository agendaRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private ClienteRepository clienteRepository;


    public List<Servico> getRelatorioServicos() {
        return servicoRepository.findAll();
    }

    public List<Agenda> getRelatorioAgenda() {
        return agendaRepository.findAll();
    }

    public List<Funcionario> getRelatorioFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public List<Cliente> getRelatorioClientes() {
        return clienteRepository.findAll();
    }
}
