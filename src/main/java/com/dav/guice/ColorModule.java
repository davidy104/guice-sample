package com.dav.guice;

import com.dav.guice.service.ColorGenerator;
import com.dav.guice.service.ColorProcessor;
import com.dav.guice.service.impl.BlueColorGenerator;
import com.dav.guice.service.impl.GeneralColorProcessor;
import com.dav.guice.service.impl.YellowColorGenerator;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class ColorModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ColorProcessor.class).annotatedWith(Names.named("generalColorProcessor")).toInstance(new GeneralColorProcessor());
	}
	
	@Provides
	@Singleton
	@Named("blueGenerator")
	public ColorGenerator blueColorGenerator() {
		return new BlueColorGenerator();
	}

	@Provides
	@Singleton
	@Named("yellowGenerator")
	public ColorGenerator yellowColorGenerator() {
		return new YellowColorGenerator();
	}

//	@Provides
//	@Singleton
//	@Named("generalColorProcessor")
//	public ColorProcessor generalColorProcessor() {
//		return new GeneralColorProcessor();
//	}

	
}
