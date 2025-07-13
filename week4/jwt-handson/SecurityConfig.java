
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig 
{
    public securitycheckabc(HttpSecurity http) throws Exception {
		http
        .antMatchers("/countries")
        .antMatchers("/authenticate")
	}

}
