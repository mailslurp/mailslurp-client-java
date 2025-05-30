/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails and SMS from dynamically allocated email addresses and phone numbers. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mailslurp.apis;

import com.mailslurp.clients.ApiException;
import com.mailslurp.models.CreateOAuthConnectionResult;
import com.mailslurp.models.CreateOAuthExchangeResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuthConnectionApi
 */
@Disabled
public class OAuthConnectionApiTest {

    private final OAuthConnectionApi api = new OAuthConnectionApi();

    /**
     * Create an OAuth connection
     *
     * Configure an inbox for OAuth sync with MailSlurp
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOAuthConnectionTest() throws ApiException {
        String redirectBase = null;
        String oAuthConnectionType = null;
        String emailAddress = null;
        CreateOAuthConnectionResult response = api.createOAuthConnection(redirectBase, oAuthConnectionType)
                .emailAddress(emailAddress)
                .execute();
        // TODO: test validations
    }

    /**
     * Exchange authorization code for access token and create inbox
     *
     * Exchange an OAuth code for an access token and create an inbox connection in MailSlurp
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void exchangeAuthorizationTokenAndCreateOrUpdateInboxTest() throws ApiException {
        String authorizationCode = null;
        String redirectUri = null;
        CreateOAuthExchangeResult response = api.exchangeAuthorizationTokenAndCreateOrUpdateInbox(authorizationCode, redirectUri)
                .execute();
        // TODO: test validations
    }

}
