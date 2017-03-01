package com.mani.gayi.pg.app;

public class Light {

	// Used to define is fan working

		private boolean lightworking;

	// Used to define fanstate i.e On or Off

		private String lightState;

		public boolean isLightworking() {
			return lightworking;
		}

		public void setLightworking(boolean lightworking) {
			this.lightworking = lightworking;
		}

		public String getLightState() {
			return lightState;
		}

		public void setLightState(String lightState) {
			this.lightState = lightState;
		}
}
