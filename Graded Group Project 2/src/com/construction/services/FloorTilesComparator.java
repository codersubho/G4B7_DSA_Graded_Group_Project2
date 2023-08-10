package com.construction.services;

import java.util.Comparator;

public class FloorTilesComparator implements Comparator<FloorTiles> {

	@Override
	public int compare(FloorTiles o1, FloorTiles o2) {
		if(o1.size < o2.size) {
			return 1;
		}
			else if(o1.size>o2.size) {
				return -1;
			}
		
		return 0;
	}

}
