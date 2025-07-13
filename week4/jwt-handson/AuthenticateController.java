import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;




import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@RestController
public class AuthenticateController 
{
	private static final Logger logger = LoggerFactory.getLogger(AuthenticateController.class);
	
	
	
	@GetMapping("/authenticate")
	public Map<String,String> demo(@RequestHeader("Authorization") String authHeader)
	{
		
		logger.info("start.....");
		HashMap<String,String> mp=new HashMap<String,String>();
		logger.info(authHeader);
		String user  = getUser(authHeader);
	    String token = generateJwt(user);
		mp.put("token",token);
		logger.info("end....");
		return(mp);
	}
	
	private String getUser(String authHeader) {
	    logger.debug("Decoding Authorization Header...");

	    
	    String encodedCredentials = authHeader.substring("Basic ".length());

	  
	    
	    
	    logger.debug("Decoded credentials: {}", decodedString);

	    
	 
	    logger.debug("Extracted username: {}", user);
	    return user;
	}

	
	
	
	
	private String generateJwt(String user) {
	    logger.debug("Generating JWT token for user: {}", user);

	    JwtBuilder builder = Jwts.builder();
	   
	    builder.setIssuedAt(new Date());  
	    builder.setExpiration(new Date(System.currentTimeMillis() + 1200)); 
	    

	    String token = builder.compact();

	    logger.debug("Generated JWT: {}", token);
	    return token;
	}

}
