package org.chain.assembly.beans;

import org.springframework.stereotype.Component;

@Component
public class ChainAssembly {

	private String chain;
	private String chainRing;
	private String paddle;
	private String crankArm;
	private String cassette;
	private int gear;

	private ChainAssembly() {
	}

	public static class Builder {

		private String chain;
		private String chainRing;
		private String paddle;
		private String crankArm;
		private String cassette;
		private int gear;

		public Builder(String chain, String chainRing, String paddle, String crankArm, String cassette) {
			super();
			this.chain = chain;
			this.chainRing = chainRing;
			this.paddle = paddle;
			this.crankArm = crankArm;
			this.cassette = cassette;
		}

		public Builder setGear(int gear) {
			this.gear = gear;
			return this;
		}
		
		public ChainAssembly build() {
			ChainAssembly chainAssembly = new ChainAssembly();
			chainAssembly.chain = this.chain;
			chainAssembly.chainRing = this.chainRing;
			chainAssembly.paddle = this.paddle;
			chainAssembly.crankArm = this.crankArm;
			chainAssembly.cassette = this.cassette;
			chainAssembly.gear = this.gear;
			return chainAssembly;
		}
	}	

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public String getChainRing() {
		return chainRing;
	}

	public void setChainRing(String chainRing) {
		this.chainRing = chainRing;
	}

	public String getPaddle() {
		return paddle;
	}

	public void setPaddle(String paddle) {
		this.paddle = paddle;
	}

	public String getCrankArm() {
		return crankArm;
	}

	public void setCrankArm(String crankArm) {
		this.crankArm = crankArm;
	}

	public String getCassette() {
		return cassette;
	}

	public void setCassette(String cassette) {
		this.cassette = cassette;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
}
