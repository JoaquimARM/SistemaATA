package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Ata;
import service.AtaService;

@Controller
@RequestMapping("/atas")
public class AtaController {
    @Autowired
    private AtaService ataService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("atas", ataService.listarAtas());
        return "atas/listar";
    }

    @GetMapping("/nova")
    public String novaAtaForm(Model model) {
        model.addAttribute("ata", new Ata());
        return "atas/novaAta";
    }

    @PostMapping
    public String salvar(@ModelAttribute Ata ata) {
        ataService.salvar(ata);
        return "redirect:/atas";
    }
}
