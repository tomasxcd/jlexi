package br.com.txg.gof.lexi.core;

import org.junit.Assert;
import org.junit.Test;

import br.com.txg.gof.lexi.core.mock.MockWindow;

public class GlyphTest {

	@Test
	public void testNewSubclassOfGlyph() {
		Glyph glyph = new LCharacter();
		Assert.assertNotNull(glyph);
	}

	@Test
	public void testDraw() {
		Glyph glyph = new LCharacter();
		Window window = new MockWindow();
		glyph.draw(window);
		Assert.assertTrue(true);
	}

}
