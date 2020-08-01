package org.assemble.frame.beans;

import java.awt.Color;

import org.assemble.frame.Material;
import org.springframework.stereotype.Component;

@Component
public class CycleFrame {
	
	private int size;
	private Color color;
	private Material material;
	
	private CycleFrame() {}
	public static class Builder{
		
		private int size;
		private Color color;
		private Material material;
		
		public Builder(int size, Material material) {
			super();
			this.size = size;
			this.material = material;
		}
		
		public Builder setColor(Color color) {
			this.color = color;
			return this;
		}
		
		public CycleFrame build() {
			CycleFrame cycleFrame = new CycleFrame();
			cycleFrame.size = this.size;
			cycleFrame.color = this.color;
			cycleFrame.material = this.material;
			return cycleFrame;
		}
		

	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
}
