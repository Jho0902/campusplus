package security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {

    @Bean
    public RoleHierarchy roleHierarchy() {
        RoleHierarchyImpl hierarchy = new RoleHierarchyImpl();
        hierarchy.setHierarchy("""
        ROLE_ADMIN > ROLE_COORDENACAO
        ROLE_COORDENACAO > ROLE_DCE
        ROLE_COORDENACAO > ROLE_DA
        ROLE_DCE > ROLE_USER
        ROLE_DA > ROLE_USER
        ROLE_USER > ROLE_ALUNO
        ROLE_USER > ROLE_PROFESSOR
    """);
        return hierarchy;
    }




}
