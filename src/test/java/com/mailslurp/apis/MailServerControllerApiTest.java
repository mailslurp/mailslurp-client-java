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
import com.mailslurp.models.DNSLookupOptions;
import com.mailslurp.models.DNSLookupResults;
import com.mailslurp.models.DNSLookupsOptions;
import com.mailslurp.models.DescribeDomainOptions;
import com.mailslurp.models.DescribeMailServerDomainResult;
import com.mailslurp.models.EmailVerificationResult;
import com.mailslurp.models.IPAddressResult;
import com.mailslurp.models.VerifyEmailAddressOptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MailServerControllerApi
 */
@Disabled
public class MailServerControllerApiTest {

    private final MailServerControllerApi api = new MailServerControllerApi();

    /**
     * Get DNS Mail Server records for a domain
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void describeMailServerDomainTest() throws ApiException {
        DescribeDomainOptions describeDomainOptions = null;
        DescribeMailServerDomainResult response = api.describeMailServerDomain(describeDomainOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Lookup DNS records for a domain
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDnsLookupTest() throws ApiException {
        DNSLookupOptions dnSLookupOptions = null;
        DNSLookupResults response = api.getDnsLookup(dnSLookupOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Lookup DNS records for multiple domains
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDnsLookupsTest() throws ApiException {
        DNSLookupsOptions dnSLookupsOptions = null;
        DNSLookupResults response = api.getDnsLookups(dnSLookupsOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Get IP address for a domain
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIpAddressTest() throws ApiException {
        String name = null;
        IPAddressResult response = api.getIpAddress(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Deprecated. Use the EmailVerificationController methods for more accurate and reliable functionality. Verify the existence of an email address at a given mail server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void verifyEmailAddressTest() throws ApiException {
        VerifyEmailAddressOptions verifyEmailAddressOptions = null;
        EmailVerificationResult response = api.verifyEmailAddress(verifyEmailAddressOptions)
                .execute();
        // TODO: test validations
    }

}
