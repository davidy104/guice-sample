package com.dav.guice.service.impl;

import com.dav.guice.model.Color
import com.dav.guice.service.ColorGenerator

public class BlueColorGenerator implements ColorGenerator{

	@Override
	Color generate() {
		return new Color(name:'blue')
	}
}
