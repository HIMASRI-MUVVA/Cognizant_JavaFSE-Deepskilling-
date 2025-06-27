package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Use the mock in your service
        MyService service = new MyService(mockApi);

        // Step 4: Verify the result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
