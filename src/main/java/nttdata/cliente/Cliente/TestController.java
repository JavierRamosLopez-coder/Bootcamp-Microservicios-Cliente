package nttdata.cliente.Cliente;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
/**
 * Clase TestController
 * 
 * @author jramlope
 *
 */
public class TestController {

	// El some.value dependerá de lo que tengamos puesto en el .yml
	// ${some.value}
	@Value("${some.value}")
	/** Atributo privado de tipo String **/
	private String myValue;

	@GetMapping(path = "/myValue")
	/**
	 * Método myValue()
	 * @return
	 */
	public String myValue() {
		return this.myValue;
	}

}
