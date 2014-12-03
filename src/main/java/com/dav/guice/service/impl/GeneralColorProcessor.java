package com.dav.guice.service.impl;

import com.dav.guice.service.ColorGenerator;
import com.dav.guice.service.ColorProcessor;
import com.google.inject.name.Named;

public class GeneralColorProcessor implements ColorProcessor {
	@Named("yellowGenerator")
	private ColorGenerator yellowGenerator;

	@Named("blueGenerator")
	private ColorGenerator blueGenerator;

	@Override
	public void process() {
		System.out.println("colors:{} " + yellowGenerator.generate() + ", "
				+ blueGenerator.generate());
	}

}
