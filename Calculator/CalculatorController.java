package course;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//Controller class which contains the flow of application execution
@RestController
public class CalculatorController {
	
	@Autowired
	private CalculatorService calService;

	@RequestMapping(method=RequestMethod.POST,value="/calc")
	public HashMap<String,String> addTopic(@RequestBody Calculator val)
	{
		Double d = calService.eval(val);
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("result", String.valueOf(d));
		return map;
	}
	
}
