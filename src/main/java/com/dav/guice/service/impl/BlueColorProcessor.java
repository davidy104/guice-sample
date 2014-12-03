package com.dav.guice.service.impl;

import com.dav.guice.service.ColorGenerator;
import com.dav.guice.service.ColorProcessor;

public class BlueColorProcessor implements ColorProcessor {

	private ColorGenerator blueGenerator;

	public BlueColorProcessor(ColorGenerator blueGenerator) {
		this.blueGenerator = blueGenerator;
	}

	@Override
	public void process() {
		System.out.println("colors:{} " + blueGenerator.generate());
	}

}
