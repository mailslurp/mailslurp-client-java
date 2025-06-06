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
import com.mailslurp.models.CreateInboxReplierOptions;
import com.mailslurp.models.InboxReplierDto;
import java.time.OffsetDateTime;
import com.mailslurp.models.PageInboxReplierDto;
import com.mailslurp.models.PageInboxReplierEvents;
import java.util.UUID;
import com.mailslurp.models.UpdateInboxReplierOptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InboxReplierControllerApi
 */
@Disabled
public class InboxReplierControllerApiTest {

    private final InboxReplierControllerApi api = new InboxReplierControllerApi();

    /**
     * Create an inbox replier
     *
     * Create a new inbox rule for reply toing, blocking, and allowing emails when sending and receiving
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewInboxReplierTest() throws ApiException {
        CreateInboxReplierOptions createInboxReplierOptions = null;
        InboxReplierDto response = api.createNewInboxReplier(createInboxReplierOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an inbox replier
     *
     * Delete inbox replier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteInboxReplierTest() throws ApiException {
        UUID id = null;
        api.deleteInboxReplier(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete inbox repliers
     *
     * Delete inbox repliers. Accepts optional inboxId filter.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteInboxRepliersTest() throws ApiException {
        UUID inboxId = null;
        api.deleteInboxRepliers()
                .inboxId(inboxId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get inbox replier event list
     *
     * Get all inbox ruleset events
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllInboxReplierEventsTest() throws ApiException {
        UUID inboxReplierId = null;
        UUID inboxId = null;
        UUID emailId = null;
        UUID sentId = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
        PageInboxReplierEvents response = api.getAllInboxReplierEvents()
                .inboxReplierId(inboxReplierId)
                .inboxId(inboxId)
                .emailId(emailId)
                .sentId(sentId)
                .page(page)
                .size(size)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get an inbox replier
     *
     * Get inbox ruleset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInboxReplierTest() throws ApiException {
        UUID id = null;
        InboxReplierDto response = api.getInboxReplier(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get an inbox replier event list
     *
     * Get inbox ruleset events
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInboxReplierEventsTest() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
        PageInboxReplierEvents response = api.getInboxReplierEvents(id)
                .page(page)
                .size(size)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * List inbox repliers
     *
     * List all repliers attached to an inbox
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInboxRepliersTest() throws ApiException {
        UUID inboxId = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        PageInboxReplierDto response = api.getInboxRepliers()
                .inboxId(inboxId)
                .page(page)
                .size(size)
                .sort(sort)
                .since(since)
                .before(before)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an inbox replier
     *
     * Update inbox ruleset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateInboxReplierTest() throws ApiException {
        UUID id = null;
        UpdateInboxReplierOptions updateInboxReplierOptions = null;
        InboxReplierDto response = api.updateInboxReplier(id, updateInboxReplierOptions)
                .execute();
        // TODO: test validations
    }

}
