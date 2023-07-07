package tempmaven;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class ExampleTest {
	
	MyClass mymock;
	@Before
	public void setUp() {
		 mymock=mock(MyClass.class);
	}
	
	@Test
	public void testBehaviour() {
		
		MyClass obj =new MyClass();
		
		when(mymock.doSomething(anyString())).thenReturn(true);
		assertTrue(mymock.doSomething("madhu"));
	}

}
