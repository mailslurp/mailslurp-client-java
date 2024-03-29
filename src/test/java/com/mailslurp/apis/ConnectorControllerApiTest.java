/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
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
import com.mailslurp.models.ConnectorDto;
import com.mailslurp.models.ConnectorSyncEventDto;
import com.mailslurp.models.ConnectorSyncRequestResult;
import com.mailslurp.models.CreateConnectorOptions;
import java.time.OffsetDateTime;
import com.mailslurp.models.PageConnector;
import com.mailslurp.models.PageConnectorSyncEvents;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectorControllerApi
 */
@Disabled
public class ConnectorControllerApiTest {

    private final ConnectorControllerApi api = new ConnectorControllerApi();

    /**
     * Create an inbox connector
     *
     * Sync emails between external mailboxes and MailSlurp inboxes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConnectorTest() throws ApiException {
        CreateConnectorOptions createConnectorOptions = null;
        ConnectorDto response = api.createConnector(createConnectorOptions);
        // TODO: test validations
    }

    /**
     * Delete an inbox connector
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteConnectorTest() throws ApiException {
        UUID id = null;
        api.deleteConnector(id);
        // TODO: test validations
    }

    /**
     * Get all inbox connector sync events
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllConnectorSyncEventsTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String sort = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        PageConnectorSyncEvents response = api.getAllConnectorSyncEvents(page, size, sort, since, before);
        // TODO: test validations
    }

    /**
     * Get an inbox connector
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectorTest() throws ApiException {
        UUID id = null;
        ConnectorDto response = api.getConnector(id);
        // TODO: test validations
    }

    /**
     * Get an inbox connector sync event
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectorSyncEventTest() throws ApiException {
        UUID id = null;
        ConnectorSyncEventDto response = api.getConnectorSyncEvent(id);
        // TODO: test validations
    }

    /**
     * Get an inbox connector sync events
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectorSyncEventsTest() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        PageConnectorSyncEvents response = api.getConnectorSyncEvents(id, page, size, sort, since, before);
        // TODO: test validations
    }

    /**
     * Get inbox connectors
     *
     * List inbox connectors that sync external emails to MailSlurp inboxes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConnectorsTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String sort = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        PageConnector response = api.getConnectors(page, size, sort, since, before);
        // TODO: test validations
    }

    /**
     * Sync an inbox connector
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void syncConnectorTest() throws ApiException {
        UUID id = null;
        ConnectorSyncRequestResult response = api.syncConnector(id);
        // TODO: test validations
    }

    /**
     * Update an inbox connector
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateConnectorTest() throws ApiException {
        UUID id = null;
        CreateConnectorOptions createConnectorOptions = null;
        ConnectorDto response = api.updateConnector(id, createConnectorOptions);
        // TODO: test validations
    }

}
