//package com.example.marjanpromotionapiv2test.Security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
////import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//public class SecurityConfiguration {
//
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////        http
//////            .authorizeHttpRequests((authz) -> authz
//////                .anyRequest().authenticated()
//////            )
//////            .httpBasic(withDefaults());
////                .cors()
////                .and()
////                .csrf()
////                .disable()
////                .authorizeHttpRequests()
////                .antMatchers()
////        return http.build();
////    }
//
//
//
//        @Bean
//        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//            http
//                    .authorizeHttpRequests((authz) -> authz
//                            .anyRequest().permitAll()
//                    )
//            ;
//
//            return http.build();
//        }
//
//
////    @Bean
////    CorsConfigurationSource corsConfigurationSource() {
////        CorsConfiguration configuration = new CorsConfiguration();
////        configuration.setAllowedOrigins(Arrays.asList("https://localhost:8080","http://localhost:8080","http://localhost:4200","https://localhost:4200"));
////        configuration.setAllowedMethods(Arrays.asList("GET","POST"));
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        source.registerCorsConfiguration("/**", configuration);
////        return source;
////    }
//
//
//
//}
