package cycleassemble.controller;

import org.assemble.frame.Material;
import org.assemble.frame.beans.CycleFrame;
import org.chain.assembly.beans.ChainAssembly;
import org.handle.bar.brakes.beans.BrakeType;
import org.handle.bar.brakes.beans.HandleBarBrakes;
import org.handle.bar.brakes.beans.HandleBarType;
import org.seating.beans.Seat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.wheels.beans.TyreType;
import org.wheels.beans.Wheel;

import cycleassemble.bean.Cycle;

@RequestMapping("/cycle")
@RestController
public class CycleController {

	@RequestMapping(path = "/get",method = RequestMethod.GET)
	public ResponseEntity firstService() {
		
		Cycle cycle = buildCycle();
		return ResponseEntity.ok(cycle);
	}
	
	public static Cycle buildCycle() {

		CycleFrame cycleFrame = new CycleFrame.Builder(24, Material.STEEL).build();
		ChainAssembly chainAssembly = new ChainAssembly.Builder("chain", "chainRing", "paddle", "crankArm", "cassette").build();
		
		HandleBarBrakes handleBar = new HandleBarBrakes.Builder(HandleBarType.BULLHORNS, BrakeType.DISCBRAKES, "brakeLiver", "brakeShifter", "handleBarGrip", "brakeSupport", "brakeRotor").build();
		Seat seat = new Seat.Builder("saddle", "seatPost", "seatPostClamp").build();
		Wheel wheel = new Wheel.Builder(TyreType.TYBELESS, 40, "spokes", "tube").build();
		
		Cycle cycle = new Cycle(cycleFrame, chainAssembly, handleBar, seat, wheel);
		return cycle;

	}
}
