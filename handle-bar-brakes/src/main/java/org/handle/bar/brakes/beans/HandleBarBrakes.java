package org.handle.bar.brakes.beans;

import org.springframework.stereotype.Component;

@Component
public class HandleBarBrakes {

	private HandleBarType handleBarType;
	private BrakeType brakeType;
	private String brakeLiver;
	private String brakeShifter;
	private String handleBarGrip;
	private String brakeSupport;
	private String brakeRotor;

	private HandleBarBrakes() {
	};

	public static class Builder {
		private HandleBarType handleBarType;
		private BrakeType brakeType;
		private String brakeLiver;
		private String brakeShifter;
		private String handleBarGrip;
		private String brakeSupport;
		private String brakeRotor;
		
		public Builder(HandleBarType handleBarType, BrakeType brakeType, String brakeLiver, String brakeShifter,
				String handleBarGrip, String brakeSupport, String brakeRotor) {
			super();
			this.handleBarType = handleBarType;
			this.brakeType = brakeType;
			this.brakeLiver = brakeLiver;
			this.brakeShifter = brakeShifter;
			this.handleBarGrip = handleBarGrip;
			this.brakeSupport = brakeSupport;
			this.brakeRotor = brakeRotor;
		}
		
		public HandleBarBrakes build() {
			HandleBarBrakes handleBar = new HandleBarBrakes();
			handleBar.handleBarType = this.handleBarType;
			handleBar.brakeType = this.brakeType;
			handleBar.brakeLiver = this.brakeLiver;
			handleBar.brakeShifter = this.brakeShifter;
			handleBar.handleBarGrip = this.handleBarGrip;
			handleBar.brakeSupport = this.brakeSupport;
			handleBar.brakeRotor = this.brakeRotor;
			return handleBar;
		}

	}

	public HandleBarType getHandleBarType() {
		return handleBarType;
	}

	public void setHandleBarType(HandleBarType handleBarType) {
		this.handleBarType = handleBarType;
	}

	public BrakeType getBrakeType() {
		return brakeType;
	}

	public void setBrakeType(BrakeType brakeType) {
		this.brakeType = brakeType;
	}

	public String getBrakeLiver() {
		return brakeLiver;
	}

	public void setBrakeLiver(String brakeLiver) {
		this.brakeLiver = brakeLiver;
	}

	public String getBrakeShifter() {
		return brakeShifter;
	}

	public void setBrakeShifter(String brakeShifter) {
		this.brakeShifter = brakeShifter;
	}

	public String getHandleBarGrip() {
		return handleBarGrip;
	}

	public void setHandleBarGrip(String handleBarGrip) {
		this.handleBarGrip = handleBarGrip;
	}

	public String getBrakeSupport() {
		return brakeSupport;
	}

	public void setBrakeSupport(String brakeSupport) {
		this.brakeSupport = brakeSupport;
	}

	public String getBrakeRotor() {
		return brakeRotor;
	}

	public void setBrakeRotor(String brakeRotor) {
		this.brakeRotor = brakeRotor;
	}
}
