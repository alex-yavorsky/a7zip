package net.sf.sevenzipjbinding.junit.snippets;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Tests {@link PrintCountOfItems} snippet
 * 
 * @author Boris Brodski
 * @since 4.65-1
 */
public class PrintCountOfItemsTest extends SnippetTest {

    @Test
    public void testSevenZipJBindingInitCheck() {
        /* BEGIN_OUTPUT(PrintCountOfItems) */
        String expected = "Count of items in archive: 4\n";
        /* END_OUTPUT */

        expected = expected.replace("\n", NEW_LINE);

        beginSnippetTest();
        PrintCountOfItems.main(new String[] { new File(getDataDir(), "snippets/simple.zip").getPath() });
        String output = endSnippetTest();
        assertEquals(expected, output);
    }
}
