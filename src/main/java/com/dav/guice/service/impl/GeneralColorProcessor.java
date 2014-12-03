package com.dav.guice.service.impl;

import com.dav.guice.service.ColorGenerator;
import com.dav.guice.service.ColorProcessor;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class GeneralColorProcessor implements ColorProcessor {
	
	@Inject
	@Named("yellowGenerator")
	private ColorGenerator yellowGenerator;

	@Inject
	@Named("blueGenerator")
	private ColorGenerator blueGenerator;

//	public GeneralColorProcessor(ColorGenerator yellowGenerator, ColorGenerator blueGenerator) {
//		super();
//		this.yellowGenerator = yellowGenerator;
//		this.blueGenerator = blueGenerator;
//	}

	@Override
	public void process() {
		System.out.println("colors:{} " + yellowGenerator.generate() + ", "
				+ blueGenerator.generate());
	}

}
