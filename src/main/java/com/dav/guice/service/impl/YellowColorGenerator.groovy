package com.dav.guice.service.impl;

import com.dav.guice.model.Color
import com.dav.guice.service.ColorGenerator

class YellowColorGenerator implements ColorGenerator{

	@Override
	Color generate() {
		return new Color(name:'yellow')
	}
}
