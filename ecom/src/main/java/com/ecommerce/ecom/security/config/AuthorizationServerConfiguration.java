package com.ecommerce.ecom.security.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.approval.UserApprovalHandler;
import org.springframework.security.oauth2.provider.token.TokenStore;

@Configuration
@EnableAuthorizationServer
/*
 * @EnableAuthorizationServer enables an Authorization Server (i.e. an
 * AuthorizationEndpoint and a TokenEndpoint) in the current application
 * context.
 */
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
	/*
	 * class AuthorizationServerConfigurerAdapter implements
	 * AuthorizationServerConfigurer which provides all the necessary methods to
	 * configure an Authorization server.
	 */
	
	@Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;    
	
	@Autowired
    @Qualifier("userDetailServiceImpl")
	private UserDetailsService userDetailsService;
	
	private static String REALM = "MY_OAUTH_REALM";
	
	@Autowired
	private TokenStore tokenStore;
	
	@Autowired
	private UserApprovalHandler userApprovalHandler;
	
	@Autowired
	@Qualifier("authenticationManagerBean")
	private AuthenticationManager authenticationManager;

//	@Override
//	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//		clients.inMemory().withClient("my-trusted-client")
//				.authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit")
//				.authorities("ROLE_CLIENT", "ROLE_TRUSTED_CLIENT").scopes("read", "write", "trust").secret("secret")
//				.accessTokenValiditySeconds(120).// Access token is only valid
//													// for 2 minutes.
//				refreshTokenValiditySeconds(600);// Refresh token is only valid
//													// for 10 minutes.
//	}
	
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.jdbc(dataSource);
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.tokenStore(tokenStore).userDetailsService(userDetailsService)  
				.authenticationManager(authenticationManager);
	}

	@Override
	public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
		oauthServer.realm(REALM + "/client");
	}
}