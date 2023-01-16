package facturas.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import facturas.entidades.PagoEntity;
import facturas.repositorios.ContribuyenteRepository;
import facturas.repositorios.PagoRepository;


@Controller
public class PagoController {
	
	@Autowired
	private PagoRepository pagoRepository;
	
	@Autowired
	private ContribuyenteRepository contribuyenteRepository;

	@GetMapping({"/pagos", "/pagos/{id}"})
	public String findPagos(@PathVariable(name = "id", required = false) Long id,Model model) {
		
		PagoEntity pagoEntity = new PagoEntity();
		if(id!=null) {
			pagoEntity = pagoRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("Id inválido de pago:" + id));
		}
		
		model.addAttribute("contribuyentes", contribuyenteRepository.findAll());
		model.addAttribute("pago", pagoEntity);
		model.addAttribute("pagos", pagoRepository.findAll());
		return "pagos/pagos";
	}
	
	@PostMapping("/pagos")
	public String addPago(PagoEntity pago, RedirectAttributes redirectAttrs) {
		
		pago = pagoRepository.save(pago);
		redirectAttrs.addFlashAttribute("mensaje", "Se guardó la pago " + pago.getFolio()+" correctamente.");
		return "redirect:/pagos";
	}
	
	
	@GetMapping("/pagos/eliminar/{id}")
	public String deleteUser(@PathVariable("id") long id, RedirectAttributes redirectAttrs) {
		
//		if(productoRepository.existsByPagoId(id)) {
//			redirectAttrs.addFlashAttribute("mensaje", "No se puede eliminar la pago " +id+" porque hay productos con esta pago");
//			return "redirect:/pagos";
//		}
		
		
		PagoEntity pagoEntity = pagoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id inválido de pago:" + id));
		redirectAttrs.addFlashAttribute("mensaje", "Pago eliminado");
	    pagoRepository.delete(pagoEntity);
	    return "redirect:/pagos";
	}
	
}
