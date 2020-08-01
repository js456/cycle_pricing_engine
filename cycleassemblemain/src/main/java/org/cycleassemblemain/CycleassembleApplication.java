package org.cycleassemblemain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*@PropertySources({
    @PropertySource("classpath:application.properties")
})*/
@SpringBootApplication
@ComponentScan({"org.assemble.frame.beans","org.chain.assembly.beans","org.handle.bar.brakes.beans","org.wheels.beans","org.seating.beans","cycleassemble.controller"})
public class CycleassembleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CycleassembleApplication.class, args);
	}

}
