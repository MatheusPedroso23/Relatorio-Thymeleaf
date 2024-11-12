package com.example.Relatorio.Controller;

import com.example.Relatorio.Models.Agenda;
import com.example.Relatorio.Models.Cliente;
import com.example.Relatorio.Models.Funcionario;
import com.example.Relatorio.Models.Servico;
import com.example.Relatorio.Service.AgendaService;
import com.example.Relatorio.Service.ClienteService;
import com.example.Relatorio.Service.FuncionarioService;
import com.example.Relatorio.Service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import  java.util.List;

@Controller
public class RelatorioController {

    @Autowired
    private AgendaService agendaService;

    @Autowired
    private ServicoService servicoService;

    @Autowired
    private FuncionarioService funcionarioService;

    @Autowired
    private ClienteService clienteService;


    @GetMapping("/")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("principal");
        return mv;
    }


    @GetMapping("/relatorios/agenda")
    public ModelAndView gerarRelatorioAgenda() {
        ModelAndView mv = new ModelAndView("relatorioAgenda");
        List<Agenda> agendas = agendaService.findAll();
        mv.addObject("agendas", agendas);
        return mv;
    }

    @GetMapping("/relatorios/servico")
    public ModelAndView gerarRelatorioServico() {
        ModelAndView mv = new ModelAndView("relatorioServico");
        List<Servico> servicos = servicoService.getRelatorioServicos();
        mv.addObject("servicos", servicos);
        return mv;
    }

    @GetMapping("/relatorios/funcionario")
    public ModelAndView gerarRelatorioFuncionario() {
        ModelAndView mv = new ModelAndView("relatorioFuncionario");
        List<Funcionario> funcionarios = funcionarioService.findAll();
        mv.addObject("funcionarios", funcionarios);
        return mv;
    }

    @GetMapping("/relatorios/cliente")
    public ModelAndView gerarRelatorioCliente() {
        ModelAndView mv = new ModelAndView("relatorioCliente");
        List<Cliente> clientes = clienteService.findAll();
        mv.addObject("clientes", clientes);
        return mv;       
    }
}