package ExternalAPI.MyServiceTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;


import ExternalAPI.ExternalAPI;
import ExternalAPI.MyService.MyService;

public class MyServiceTest 
{
	
	
        
        
        @Test
        public void testVerifyInteraction() {
            
            ExternalApi mockApi = Mockito.mock(ExternalApi.class);

            
            MyService service = new MyService(mockApi);
            service.fetchData();

            verify(mockApi).getData();     	
        }
        
        
        
        
        
        
    }

