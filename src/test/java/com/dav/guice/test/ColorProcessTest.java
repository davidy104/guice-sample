package com.dav.guice.test;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.dav.guice.ColorModule;
import com.dav.guice.service.ColorProcessor;
import com.dav.guice.test.GuiceJUnitRunner.GuiceModules;
import com.google.inject.Inject;
import com.google.inject.name.Named;

@RunWith(GuiceJUnitRunner.class)
@GuiceModules({ ColorModule.class })
public class ColorProcessTest {
	@Inject
	@Named("generalColorProcessor")
	private ColorProcessor colorProcessor;

	@Inject
	@Named("blueColorProcessor")
	private ColorProcessor blueColorProcessor;

	@Inject
	@Named("yellowColorProcessor")
	private ColorProcessor yellowColorProcessor;

	@Test
	public void test() {
		colorProcessor.process();
		blueColorProcessor.process();
		yellowColorProcessor.process();
	}

}
