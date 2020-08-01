package org.wheels.beans;

import org.springframework.stereotype.Component;

@Component
public class Wheel {
	private TyreType tyreType;
	private int tyreSize;
	private String spokes;
	private String tube;

	private Wheel() {
	}

	public static class Builder {

		private TyreType tyreType;
		private int tyreSize;
		private String spokes;
		private String tube;

		public Builder(TyreType tyreType, int tyreSize, String spokes, String tube) {
			this.tyreType = tyreType;
			this.tyreSize = tyreSize;
			this.spokes = spokes;
			this.tube = tube;
		}

		public Wheel build() {
			
			Wheel wheel = new Wheel();
			wheel.tyreType = this.tyreType;
			wheel.tyreSize = this.tyreSize;
			wheel.spokes = this.spokes;
			wheel.tube = this.tube;
			return wheel;
		}
		public TyreType getTyreType() {
			return tyreType;
		}

		public void setTyreType(TyreType tyreType) {
			this.tyreType = tyreType;
		}

		public int getTyreSize() {
			return tyreSize;
		}

		public void setTyreSize(int tyreSize) {
			this.tyreSize = tyreSize;
		}

		public String getSpokes() {
			return spokes;
		}

		public void setSpokes(String spokes) {
			this.spokes = spokes;
		}

		public String getTube() {
			return tube;
		}

		public void setTube(String tube) {
			this.tube = tube;
		}

	}

	public TyreType getTyreType() {
		return tyreType;
	}

	public void setTyreType(TyreType tyreType) {
		this.tyreType = tyreType;
	}

	public int getTyreSize() {
		return tyreSize;
	}

	public void setTyreSize(int tyreSize) {
		this.tyreSize = tyreSize;
	}

	public String getSpokes() {
		return spokes;
	}

	public void setSpokes(String spokes) {
		this.spokes = spokes;
	}

	public String getTube() {
		return tube;
	}

	public void setTube(String tube) {
		this.tube = tube;
	}
}
