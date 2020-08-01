package org.seating.beans;

import org.springframework.stereotype.Component;

@Component
public class Seat {

	private String saddle;
	private String seatPost;
	private String seatPostClamp;

	private Seat() {
	};

	public static class Builder {

		private String saddle;
		private String seatPost;
		private String seatPostClamp;

		public Builder(String saddle, String seatPost, String seatPostClamp) {
			super();
			this.saddle = saddle;
			this.seatPost = seatPost;
			this.seatPostClamp = seatPostClamp;
		}

		public Seat build() {
			Seat seat = new Seat();
			seat.saddle = this.saddle;
			seat.seatPost = this.seatPost;
			seat.seatPostClamp = this.seatPostClamp;
			return seat;
		}
	}

	public String getSaddle() {
		return saddle;
	}

	public void setSaddle(String saddle) {
		this.saddle = saddle;
	}

	public String getSeatPost() {
		return seatPost;
	}

	public void setSeatPost(String seatPost) {
		this.seatPost = seatPost;
	}

	public String getSeatPostClamp() {
		return seatPostClamp;
	}

	public void setSeatPostClamp(String seatPostClamp) {
		this.seatPostClamp = seatPostClamp;
	}

}
