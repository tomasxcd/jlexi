package br.com.txg.gof.lexi.core;

import org.junit.Assert;
import org.junit.Test;

public class GlyphTest {

	@Test
	public void testGlyph() {
		Glyph glyph = new LCharacter();
		Assert.assertNotNull(glyph);
	}

}
