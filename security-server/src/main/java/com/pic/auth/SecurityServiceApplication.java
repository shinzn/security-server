package com.pic.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableEurekaClient
@SpringBootApplication
@EnableAuthorizationServer
//@EnableResourceServer
public class SecurityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityServiceApplication.class, args);
	}

}

//TEST1
//POST: http://localhost:8763/oauth/token
/*
 * input: 
 *   Authorization: 
 *     Type: Basic Auth
 *     Username: mobile
 *     Password: pin
 *   Body:  *form-data*
 *     grant_type: password
 *     username: krish
 *     password: kpass
 * Output: 
 * {
    "access_token": "6d94a5d9-8590-4370-9878-5ad3660b23b9",
    "token_type": "bearer",
    "refresh_token": "870c38f4-5220-40c4-bbad-e5b3e59927e5",
    "expires_in": 3599,
    "scope": "READ WRITE"
	}
 */

//TEST2
//POST: http://localhost:8763/oauth/check_token?token=6d94a5d9-8590-4370-9878-5ad3660b23b9
/*
 * input: 
 *   Authorization: 
 *     Type: Basic Auth
 *     Username: mobile
 *     Password: pin
 * Output: 
 * {
    "aud": [
        "payment",
        "inventory"
    ],
    "user_name": "krish",
    "scope": [
        "READ",
        "WRITE"
    ],
    "active": true,
    "exp": 1571042397,
    "authorities": [
        "ROLE_admin",
        "delete_profile",
        "update_profile",
        "read_profile",
        "create_profile"
    ],
    "client_id": "mobile"
}
 */