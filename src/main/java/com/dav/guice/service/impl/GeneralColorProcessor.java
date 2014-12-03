package com.dav.guice.service.impl;

import com.dav.guice.service.ColorGenerator;
import com.dav.guice.service.ColorProcessor;

public class GeneralColorProcessor implements ColorProcessor {
	private ColorGenerator yellowGenerator;

	private ColorGenerator blueGenerator;

	public GeneralColorProcessor(ColorGenerator yellowGenerator, ColorGenerator blueGenerator) {
		super();
		this.yellowGenerator = yellowGenerator;
		this.blueGenerator = blueGenerator;
	}

	@Override
	public void process() {
		System.out.println("colors:{} " + yellowGenerator.generate() + ", "
				+ blueGenerator.generate());
	}

}
