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


package com.mailslurp.models;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mailslurp.models.CreateConnectorImapOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for CreateConnectorOptions
 */
public class CreateConnectorOptionsTest {
    private final CreateConnectorOptions model = new CreateConnectorOptions();

    /**
     * Model tests for CreateConnectorOptions
     */
    @Test
    public void testCreateConnectorOptions() {
        // TODO: test CreateConnectorOptions
    }

    /**
     * Test the property 'connectorType'
     */
    @Test
    public void connectorTypeTest() {
        // TODO: test connectorType
    }

    /**
     * Test the property 'connectorAuthType'
     */
    @Test
    public void connectorAuthTypeTest() {
        // TODO: test connectorAuthType
    }

    /**
     * Test the property 'imapSettings'
     */
    @Test
    public void imapSettingsTest() {
        // TODO: test imapSettings
    }

    /**
     * Test the property 'inboxId'
     */
    @Test
    public void inboxIdTest() {
        // TODO: test inboxId
    }

    /**
     * Test the property 'syncEnabled'
     */
    @Test
    public void syncEnabledTest() {
        // TODO: test syncEnabled
    }

    /**
     * Test the property 'syncScheduleType'
     */
    @Test
    public void syncScheduleTypeTest() {
        // TODO: test syncScheduleType
    }

    /**
     * Test the property 'syncInterval'
     */
    @Test
    public void syncIntervalTest() {
        // TODO: test syncInterval
    }

}