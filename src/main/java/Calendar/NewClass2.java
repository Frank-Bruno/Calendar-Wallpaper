/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collection;





/**
 *
 * @author João Neto 2
 */
public class NewClass2{
     public static GoogleCredential createCredentialWithAccessTokenOnly(TokenResponse tokenResponse) {
 return new GoogleCredential().setFromTokenResponse(tokenResponse);
 }
      public static GoogleCredential createCredentialWithRefreshToken(HttpTransport transport,
 JsonFactory jsonFactory, GoogleClientSecrets clientSecrets, TokenResponse tokenResponse) {
 return new GoogleCredential.Builder().setTransport(transport)
 .setJsonFactory(jsonFactory)
 .setClientSecrets(clientSecrets)
 .build()
 .setFromTokenResponse(tokenResponse);
 }
      public static GoogleCredential createCredentialForServiceAccount(
 HttpTransport transport,
 JsonFactory jsonFactory,
 String serviceAccountId,
 Collection<String> serviceAccountScopes,
 File p12File) throws GeneralSecurityException, IOException {
 return new GoogleCredential.Builder().setTransport(transport)
 .setJsonFactory(jsonFactory)
 .setServiceAccountId(serviceAccountId)
 .setServiceAccountScopes(serviceAccountScopes)
 .setServiceAccountPrivateKeyFromP12File(p12File)
 .build();
 }
      public static GoogleCredential createCredentialForServiceAccountImpersonateUser(
 HttpTransport transport,
 JsonFactory jsonFactory,
 String serviceAccountId,
 Collection<String> serviceAccountScopes,
 File p12File,
 String serviceAccountUser) throws GeneralSecurityException, IOException {
 return new GoogleCredential.Builder().setTransport(transport)
 .setJsonFactory(jsonFactory)
 .setServiceAccountId(serviceAccountId)
 .setServiceAccountScopes(serviceAccountScopes)
 .setServiceAccountPrivateKeyFromP12File(p12File)
 .setServiceAccountUser(serviceAccountUser)
 .build();
 }
}
