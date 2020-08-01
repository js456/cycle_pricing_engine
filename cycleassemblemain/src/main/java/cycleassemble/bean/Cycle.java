package cycleassemble.bean;

import org.assemble.frame.beans.CycleFrame;
import org.chain.assembly.beans.ChainAssembly;
import org.handle.bar.brakes.beans.HandleBarBrakes;
import org.seating.beans.Seat;
import org.wheels.beans.Wheel;

public class Cycle {

	private CycleFrame cycleFrame;
	private ChainAssembly chainAssembly;
	private HandleBarBrakes handleBar;
	private Seat seat;
	private Wheel wheel;
	public Cycle(CycleFrame cycleFrame, ChainAssembly chainAssembly, HandleBarBrakes handleBar, Seat seat,
			Wheel wheel) {
		super();
		this.cycleFrame = cycleFrame;
		this.chainAssembly = chainAssembly;
		this.handleBar = handleBar;
		this.seat = seat;
		this.wheel = wheel;
	}
	public CycleFrame getCycleFrame() {
		return cycleFrame;
	}
	public void setCycleFrame(CycleFrame cycleFrame) {
		this.cycleFrame = cycleFrame;
	}
	public ChainAssembly getChainAssembly() {
		return chainAssembly;
	}
	public void setChainAssembly(ChainAssembly chainAssembly) {
		this.chainAssembly = chainAssembly;
	}
	public HandleBarBrakes getHandleBar() {
		return handleBar;
	}
	public void setHandleBar(HandleBarBrakes handleBar) {
		this.handleBar = handleBar;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	
	
}
