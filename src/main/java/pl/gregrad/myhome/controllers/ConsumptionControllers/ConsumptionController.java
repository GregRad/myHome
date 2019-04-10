package pl.gregrad.myhome.controllers.ConsumptionControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.gregrad.myhome.dto.ConsumptionDTO;
import pl.gregrad.myhome.services.Consumption.ConsumptionService;

import java.util.List;

@Controller
@RequestMapping("/consumption")
public class ConsumptionController {

    @Autowired
    private ConsumptionService consumptionService;

    @GetMapping("/list")
    public String consumprionList() {
    	return "Consumptions";
    }
    @GetMapping("/list/{year}")
    public String allConsumptionByYear (@PathVariable Integer year,
    									Model model) {
    	List<ConsumptionDTO> allConsumptionByYear = consumptionService.findConsumptionsByYear(year);
    	model.addAttribute("consumptionByYear" , allConsumptionByYear);
    	return "Consumption_Summary";
    	
    }
    @GetMapping("/{year}")
    public String consumptionByYear(@PathVariable Integer year, Model model) {
    	List<ConsumptionDTO> consumptionByYear = consumptionService.findConsumptionsByYear(year);
    	List<ConsumptionDTO> coldWater = consumptionService.findConsumprionsByYearAndType(year, "Zimna woda");
    	List<ConsumptionDTO> hotWater = consumptionService.findConsumprionsByYearAndType(year, "Goraca woda");
    	List<ConsumptionDTO> electricity = consumptionService.findConsumprionsByYearAndType(year, "Prad");
    	model.addAttribute("consumptonByYear", consumptionByYear);
    	model.addAttribute("coldWater", coldWater);
    	model.addAttribute("hotWater", hotWater);
    	model.addAttribute("electricty", electricity);
    	return "Consumption_By_Year";
    }
   
  

}
