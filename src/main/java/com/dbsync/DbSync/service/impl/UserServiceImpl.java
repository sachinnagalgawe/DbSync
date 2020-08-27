package com.dbsync.DbSync.service.impl;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.stereotype.Service;

import com.dbsync.DbSync.service.UserService;
import com.dbsync.DbSync.service.util.CredentialUtils;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public Credential login() throws IOException, GeneralSecurityException {
		final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
		Credential credential = CredentialUtils.getCredentials(HTTP_TRANSPORT);
		return credential;
	}
}
