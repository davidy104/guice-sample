package com.dav.guice;

import com.dav.guice.service.ColorGenerator;
import com.dav.guice.service.ColorProcessor;
import com.dav.guice.service.impl.BlueColorGenerator;
import com.dav.guice.service.impl.GeneralColorProcessor;
import com.dav.guice.service.impl.YellowColorGenerator;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class ColorModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ColorProcessor.class).annotatedWith(Names.named("generalColorProcessor")).toProvider(ColorProcessorProvider.class).asEagerSingleton();
	}

	public static class ColorProcessorProvider implements Provider<ColorProcessor> {

		@Inject
		@Named("yellowGenerator")
		ColorGenerator yellowColorGenerator;

		@Inject
		@Named("blueGenerator")
		ColorGenerator blueColorGenerator;

		@Override
		public ColorProcessor get() {
			return new GeneralColorProcessor(yellowColorGenerator, blueColorGenerator);
		}

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

	// @Provides
	// @Singleton
	// @Named("generalColorProcessor")
	// public ColorProcessor generalColorProcessor(@Named("yellowGenerator")
	// ColorGenerator yellowColorGenerator,@Named("blueGenerator")
	// ColorGenerator blueColorGenerator) {
	// return new
	// GeneralColorProcessor(yellowColorGenerator,blueColorGenerator);
	// }

}
