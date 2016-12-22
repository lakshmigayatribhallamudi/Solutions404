package com.mani.gayi.I;

public class TrapppingWater {

	public static void main(String[] args) {

		int[] towers = { 2, 0, 2 };

		System.out.println("Water Collected : " + getWaterQty(towers));

	}

	// function returns the water qty.
	public static int getWaterQty(int[] towers) {
		int towersOnRight[] = new int[towers.length];
		int maxTowerSizeOnRight = 0;
		int maxTowerSizeonLeft = 0;
		int waterQty = 0;
		for (int rightTowerIndex = towers.length - 1; rightTowerIndex >= 0; rightTowerIndex--) {
			if (maxTowerSizeOnRight < towers[rightTowerIndex]) {
				maxTowerSizeOnRight = towers[rightTowerIndex];
				towersOnRight[rightTowerIndex] = maxTowerSizeOnRight;
			} else {
				towersOnRight[rightTowerIndex] = maxTowerSizeOnRight;
			}
		}

		for (int towerindex = 0; towerindex < towers.length; towerindex++) {
			if (towers[towerindex] < maxTowerSizeonLeft && towers[towerindex] < towersOnRight[towerindex]) {
				waterQty = waterQty + Math.min(maxTowerSizeonLeft, towersOnRight[towerindex]) - towers[towerindex];
			}
			if (maxTowerSizeonLeft < towers[towerindex]) {
				maxTowerSizeonLeft = towers[towerindex];
			}

		}

		return waterQty;

	}

}
