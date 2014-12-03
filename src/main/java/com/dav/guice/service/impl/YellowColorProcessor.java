package com.dav.guice.service.impl;

import com.dav.guice.service.ColorGenerator;
import com.dav.guice.service.ColorProcessor;

public class YellowColorProcessor implements ColorProcessor {

	private ColorGenerator yellowColorGenerator;

	public YellowColorProcessor(ColorGenerator yellowColorGenerator) {
		super();
		this.yellowColorGenerator = yellowColorGenerator;
	}

	@Override
	public void process() {
		System.out.println("colors:{} " + yellowColorGenerator.generate());
	}

}
