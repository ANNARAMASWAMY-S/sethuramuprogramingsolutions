package ExternalAPI.MyServiceTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito;

import org.junit.jupiter.api.Test;


import ExternalAPI.ExternalAPI;
import ExternalAPI.MyService.MyService;

public class MyServiceTest 
{
	
	@Test
    public void testExternalApi() {
         
        ExternalAPI mockApi = Mockito.mock(ExternalAPI.class);

        
        when(mockApi.getData()).thenReturn("Mock Data");

        
        MyService service = new MyService(mockApi);
		

        String result = service.fetchData();
        assertEquals("Mock Data",result);
	}
        
        
        
       
        
        
    }

