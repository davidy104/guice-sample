package com.dav.guice.service.impl;

import com.dav.guice.service.ColorGenerator;
import com.dav.guice.service.ColorProcessor;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class YellowColor1Processor implements ColorProcessor {

	@Inject
	@Named("yellowGenerator")
	private ColorGenerator yellowColorGenerator;

	@Override
	public void process() {
		System.out.println("YellowColor1Processor colors:{} " + yellowColorGenerator.generate());
	}

}
