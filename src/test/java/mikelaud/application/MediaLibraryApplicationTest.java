package mikelaud.application;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class MediaLibraryApplicationTest {

	private MediaLibraryApplication mMediaLibraryApplication = null;
	
	@Before
	public void before() {
		mMediaLibraryApplication = new MediaLibraryApplication();
	}
	
	@Test
	public void testConstructor() {
		assertNotNull(mMediaLibraryApplication);
	}

}
