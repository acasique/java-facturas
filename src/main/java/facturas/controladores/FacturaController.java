package facturas.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import facturas.entidades.FacturaEntity;
import facturas.repositorios.ContribuyenteRepository;
import facturas.repositorios.FacturaRepository;


@Controller
public class FacturaController {
	
	@Autowired
	private FacturaRepository facturaRepository;
	
	@Autowired
	private ContribuyenteRepository contribuyenteRepository;

	@GetMapping({"/facturas", "/facturas/{id}"})
	public String findFacturas(@PathVariable(name = "id", required = false) Long id,Model model) {
		
		FacturaEntity facturaEntity = new FacturaEntity();
		if(id!=null) {
			facturaEntity = facturaRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("Id inválido de factura:" + id));
		}
		
		model.addAttribute("contribuyentes", contribuyenteRepository.findAll());
		model.addAttribute("factura", facturaEntity);
		model.addAttribute("facturas", facturaRepository.findAll());
		return "facturas/facturas";
	}
	
	@PostMapping("/facturas")
	public String addFactura(FacturaEntity factura, RedirectAttributes redirectAttrs) {
		
		factura = facturaRepository.save(factura);
		redirectAttrs.addFlashAttribute("mensaje", "Se guardó la factura " + factura.getFolio()+" correctamente.");
		return "redirect:/facturas";
	}
	
	
	@GetMapping("/facturas/eliminar/{id}")
	public String deleteUser(@PathVariable("id") long id, RedirectAttributes redirectAttrs) {
		
//		if(productoRepository.existsByFacturaId(id)) {
//			redirectAttrs.addFlashAttribute("mensaje", "No se puede eliminar la factura " +id+" porque hay productos con esta factura");
//			return "redirect:/facturas";
//		}
		
		
		FacturaEntity facturaEntity = facturaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id inválido de factura:" + id));
		redirectAttrs.addFlashAttribute("mensaje", "Factura eliminado");
	    facturaRepository.delete(facturaEntity);
	    return "redirect:/facturas";
	}
	
}
