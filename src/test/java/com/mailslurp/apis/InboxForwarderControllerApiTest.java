/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://www.mailslurp.com/docs/) - [Examples](https://github.com/mailslurp/examples) repository 
 *
 * The version of the OpenAPI document: 6.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mailslurp.apis;

import com.mailslurp.clients.ApiException;
import com.mailslurp.models.CreateInboxForwarderOptions;
import com.mailslurp.models.InboxForwarderDto;
import com.mailslurp.models.InboxForwarderTestOptions;
import com.mailslurp.models.InboxForwarderTestResult;
import com.mailslurp.models.PageInboxForwarderDto;
import com.mailslurp.models.TestNewInboxForwarderOptions;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InboxForwarderControllerApi
 */
@Ignore
public class InboxForwarderControllerApiTest {

    private final InboxForwarderControllerApi api = new InboxForwarderControllerApi();

    
    /**
     * Create an inbox forwarder
     *
     * Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewInboxForwarderTest() throws ApiException {
        CreateInboxForwarderOptions createInboxForwarderOptions = null;
        UUID inboxId = null;
        InboxForwarderDto response = api.createNewInboxForwarder(createInboxForwarderOptions, inboxId);

        // TODO: test validations
    }
    
    /**
     * Delete an inbox forwarder
     *
     * Delete inbox forwarder
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInboxForwarderTest() throws ApiException {
        UUID id = null;
        api.deleteInboxForwarder(id);

        // TODO: test validations
    }
    
    /**
     * Delete inbox forwarders
     *
     * Delete inbox forwarders. Accepts optional inboxId filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInboxForwardersTest() throws ApiException {
        UUID inboxId = null;
        api.deleteInboxForwarders(inboxId);

        // TODO: test validations
    }
    
    /**
     * Get an inbox forwarder
     *
     * Get inbox ruleset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInboxForwarderTest() throws ApiException {
        UUID id = null;
        InboxForwarderDto response = api.getInboxForwarder(id);

        // TODO: test validations
    }
    
    /**
     * List inbox forwarders
     *
     * List all forwarders attached to an inbox
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInboxForwardersTest() throws ApiException {
        UUID inboxId = null;
        Integer page = null;
        String searchFilter = null;
        Integer size = null;
        String sort = null;
        PageInboxForwarderDto response = api.getInboxForwarders(inboxId, page, searchFilter, size, sort);

        // TODO: test validations
    }
    
    /**
     * Test an inbox forwarder
     *
     * Test an inbox forwarder
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testInboxForwarderTest() throws ApiException {
        UUID id = null;
        InboxForwarderTestOptions inboxForwarderTestOptions = null;
        InboxForwarderTestResult response = api.testInboxForwarder(id, inboxForwarderTestOptions);

        // TODO: test validations
    }
    
    /**
     * Test inbox forwarders for inbox
     *
     * Test inbox forwarders for inbox
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testInboxForwardersForInboxTest() throws ApiException {
        UUID inboxId = null;
        InboxForwarderTestOptions inboxForwarderTestOptions = null;
        InboxForwarderTestResult response = api.testInboxForwardersForInbox(inboxId, inboxForwarderTestOptions);

        // TODO: test validations
    }
    
    /**
     * Test new inbox forwarder
     *
     * Test new inbox forwarder
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testNewInboxForwarderTest() throws ApiException {
        TestNewInboxForwarderOptions testNewInboxForwarderOptions = null;
        InboxForwarderTestResult response = api.testNewInboxForwarder(testNewInboxForwarderOptions);

        // TODO: test validations
    }
    
}
