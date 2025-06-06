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
import com.mailslurp.models.CheckEmailFeaturesClientSupportOptions;
import com.mailslurp.models.CheckEmailFeaturesClientSupportResults;
import com.mailslurp.models.FakeEmailPreview;
import com.mailslurp.models.FakeEmailResult;
import com.mailslurp.models.GenerateBimiRecordOptions;
import com.mailslurp.models.GenerateBimiRecordResults;
import com.mailslurp.models.GenerateDmarcRecordOptions;
import com.mailslurp.models.GenerateDmarcRecordResults;
import com.mailslurp.models.GenerateMtaStsRecordOptions;
import com.mailslurp.models.GenerateMtaStsRecordResults;
import com.mailslurp.models.GenerateTlsReportingRecordOptions;
import com.mailslurp.models.GenerateTlsReportingRecordResults;
import com.mailslurp.models.LookupBimiDomainOptions;
import com.mailslurp.models.LookupBimiDomainResults;
import com.mailslurp.models.LookupDmarcDomainOptions;
import com.mailslurp.models.LookupDmarcDomainResults;
import com.mailslurp.models.LookupMtaStsDomainOptions;
import com.mailslurp.models.LookupMtaStsDomainResults;
import com.mailslurp.models.LookupTlsReportingDomainOptions;
import com.mailslurp.models.LookupTlsReportingDomainResults;
import com.mailslurp.models.NewFakeEmailAddressResult;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ToolsControllerApi
 */
@Disabled
public class ToolsControllerApiTest {

    private final ToolsControllerApi api = new ToolsControllerApi();

    /**
     * Check email client support for email HTML and CSS features
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkEmailFeaturesClientSupportTest() throws ApiException {
        CheckEmailFeaturesClientSupportOptions checkEmailFeaturesClientSupportOptions = null;
        CheckEmailFeaturesClientSupportResults response = api.checkEmailFeaturesClientSupport(checkEmailFeaturesClientSupportOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a new email address using the fake email domains
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewFakeEmailAddressTest() throws ApiException {
        NewFakeEmailAddressResult response = api.createNewFakeEmailAddress()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a fake email address using the fake email domains
     *
     * Delete a fake email address using the fake email domains
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteNewFakeEmailAddressTest() throws ApiException {
        String emailAddress = null;
        api.deleteNewFakeEmailAddress(emailAddress)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a BIMI record policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateBimiRecordTest() throws ApiException {
        GenerateBimiRecordOptions generateBimiRecordOptions = null;
        GenerateBimiRecordResults response = api.generateBimiRecord(generateBimiRecordOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a DMARC record policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateDmarcRecordTest() throws ApiException {
        GenerateDmarcRecordOptions generateDmarcRecordOptions = null;
        GenerateDmarcRecordResults response = api.generateDmarcRecord(generateDmarcRecordOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a TLS reporting record policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateMtaStsRecordTest() throws ApiException {
        GenerateMtaStsRecordOptions generateMtaStsRecordOptions = null;
        GenerateMtaStsRecordResults response = api.generateMtaStsRecord(generateMtaStsRecordOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a TLS reporting record policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateTlsReportingRecordTest() throws ApiException {
        GenerateTlsReportingRecordOptions generateTlsReportingRecordOptions = null;
        GenerateTlsReportingRecordResults response = api.generateTlsReportingRecord(generateTlsReportingRecordOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFakeEmailByEmailAddressTest() throws ApiException {
        String emailAddress = null;
        FakeEmailResult response = api.getFakeEmailByEmailAddress(emailAddress)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a fake email by its ID
     *
     * Get a fake email by its ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFakeEmailByIdTest() throws ApiException {
        UUID id = null;
        FakeEmailResult response = api.getFakeEmailById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get raw fake email content
     *
     * Retrieve the raw content of a fake email by its ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFakeEmailRawTest() throws ApiException {
        UUID id = null;
        String response = api.getFakeEmailRaw(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get fake emails for an address
     *
     * Get fake emails for an address
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFakeEmailsForAddressTest() throws ApiException {
        String emailAddress = null;
        Integer page = null;
        List<FakeEmailPreview> response = api.getFakeEmailsForAddress(emailAddress)
                .page(page)
                .execute();
        // TODO: test validations
    }

    /**
     * Lookup a BIMI record policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupBimiDomainTest() throws ApiException {
        LookupBimiDomainOptions lookupBimiDomainOptions = null;
        LookupBimiDomainResults response = api.lookupBimiDomain(lookupBimiDomainOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Lookup a DMARC record policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupDmarcDomainTest() throws ApiException {
        LookupDmarcDomainOptions lookupDmarcDomainOptions = null;
        LookupDmarcDomainResults response = api.lookupDmarcDomain(lookupDmarcDomainOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Lookup a MTA-STS domain policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupMtaStsDomainTest() throws ApiException {
        LookupMtaStsDomainOptions lookupMtaStsDomainOptions = null;
        LookupMtaStsDomainResults response = api.lookupMtaStsDomain(lookupMtaStsDomainOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Lookup a TLS reporting domain policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lookupTlsReportingDomainTest() throws ApiException {
        LookupTlsReportingDomainOptions lookupTlsReportingDomainOptions = null;
        LookupTlsReportingDomainResults response = api.lookupTlsReportingDomain(lookupTlsReportingDomainOptions)
                .execute();
        // TODO: test validations
    }

}
