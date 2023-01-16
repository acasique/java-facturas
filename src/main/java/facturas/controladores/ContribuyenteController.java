package facturas.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import facturas.entidades.ContribuyenteEntity;
import facturas.repositorios.ContribuyenteRepository;


@Controller
public class ContribuyenteController {
	
	@Autowired
	private ContribuyenteRepository contribuyenteRepository;
	
//	@Autowired
//	private ProductoRepository productoRepository;

	@GetMapping({"/contribuyentes", "/contribuyentes/{id}"})
	public String findContribuyentes(@PathVariable(name = "id", required = false) Long id,Model model) {
		
		ContribuyenteEntity contribuyenteEntity = new ContribuyenteEntity();
		if(id!=null) {
			contribuyenteEntity = contribuyenteRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("Id inválido de contribuyente:" + id));
		}
		
		model.addAttribute("contribuyente", contribuyenteEntity);
		model.addAttribute("contribuyentes", contribuyenteRepository.findAll());
		return "contribuyentes/contribuyentes";
	}
	
	@PostMapping("/contribuyentes")
	public String addContribuyente(ContribuyenteEntity contribuyente, RedirectAttributes redirectAttrs) {
		
		contribuyente = contribuyenteRepository.save(contribuyente);
		redirectAttrs.addFlashAttribute("mensaje", "Se guardó la contribuyente " + contribuyente.getNombre()+" correctamente.");
		return "redirect:/contribuyentes";
	}
	
	
	@GetMapping("/contribuyentes/eliminar/{id}")
	public String deleteUser(@PathVariable("id") long id, RedirectAttributes redirectAttrs) {
		
//		if(productoRepository.existsByContribuyenteId(id)) {
//			redirectAttrs.addFlashAttribute("mensaje", "No se puede eliminar la contribuyente " +id+" porque hay productos con esta contribuyente");
//			return "redirect:/contribuyentes";
//		}
		
		
		ContribuyenteEntity contribuyenteEntity = contribuyenteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id inválido de contribuyente:" + id));
		redirectAttrs.addFlashAttribute("mensaje", "Contribuyente eliminado");
	    contribuyenteRepository.delete(contribuyenteEntity);
	    return "redirect:/contribuyentes";
	}
	
}
