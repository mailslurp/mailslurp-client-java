/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.   ## Resources - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mailslurp.api.api;

import com.mailslurp.client.ApiException;
import com.mailslurp.models.DescribeDomainOptions;
import com.mailslurp.models.DescribeMailServerDomainResult;
import com.mailslurp.models.EmailVerificationResult;
import com.mailslurp.models.VerifyEmailAddressOptions;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MailServerControllerApi
 */
@Ignore
public class MailServerControllerApiTest {

    private final MailServerControllerApi api = new MailServerControllerApi();

    
    /**
     * Get DNS Mail Server records for a domain
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void describeMailServerDomainTest() throws ApiException {
        DescribeDomainOptions describeOptions = null;
        DescribeMailServerDomainResult response = api.describeMailServerDomain(describeOptions);

        // TODO: test validations
    }
    
    /**
     * Verify the existence of an email address at a given mail server.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyEmailAddressTest() throws ApiException {
        VerifyEmailAddressOptions verifyOptions = null;
        EmailVerificationResult response = api.verifyEmailAddress(verifyOptions);

        // TODO: test validations
    }
    
}