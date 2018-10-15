/* ecomm.user*/
CREATE TABLE ecomm.user (
  id  INT(11) PRIMARY KEY,
  user_name VARCHAR(45),
  password  VARCHAR(100) ,
  account_expired INT(11) ,
  account_locked INT(11) ,
  credentials_expired INT(11) ,
  enabled VARCHAR(45)
  ) ;

  
  
  /* ecomm.ClientDetails*/
  -- customized oauth_client_details table
create table ecomm.ClientDetails (
  appId VARCHAR(256) PRIMARY KEY,
  resourceIds VARCHAR(256),
  appSecret VARCHAR(256),
  scope VARCHAR(256),
  grantTypes VARCHAR(256),
  redirectUrl VARCHAR(256),
  authorities VARCHAR(256),
  access_token_validity INT(4),
  refresh_token_validity INT(4),
  additionalInformation VARCHAR(4096),
  autoApproveScopes VARCHAR(256)
);


/* ecomm.oauth_client_details*/

create table ecomm.oauth_client_details (
  client_id VARCHAR(256) PRIMARY KEY,
  resource_ids VARCHAR(256),
  client_secret VARCHAR(256),
  scope VARCHAR(256),
  authorized_grant_types VARCHAR(256),
  web_server_redirect_uri VARCHAR(256),
  authorities VARCHAR(256),
  access_token_validity INT(4),
  refresh_token_validity INT(4),
  additional_information VARCHAR(4096),
  autoapprove VARCHAR(256)
);

/* ecomm.oauth_approvals*/
create table ecomm.oauth_approvals (
	userId VARCHAR(256),
	clientId VARCHAR(256),
	scope VARCHAR(256),
	status VARCHAR(10),
	expiresAt TIMESTAMP,
	lastModifiedAt TIMESTAMP
);

/* ecomm.oauth_refresh_token*/
create table ecomm.oauth_refresh_token (
  token_id VARCHAR(256),
  token LONGBLOB,
  authentication LONGBLOB
);

/* ecomm.oauth_access_token*/
create table ecomm.oauth_access_token (
  token_id VARCHAR(256),
  token LONGBLOB,
  authentication_id VARCHAR(256) PRIMARY KEY,
  user_name VARCHAR(256),
  client_id VARCHAR(256),
  authentication LONGBLOB,
  refresh_token VARCHAR(256)
);


/* ecomm.oauth_client_token*/
create table ecomm.oauth_client_token (
  token_id VARCHAR(256),
  token LONGBLOB,
  authentication_id VARCHAR(256) PRIMARY KEY,
  user_name VARCHAR(256),
  client_id VARCHAR(256)
);


/* ecomm.oauth_code*/
create table ecomm.oauth_code (
  code VARCHAR(256), 
  authentication LONGBLOB
);



















