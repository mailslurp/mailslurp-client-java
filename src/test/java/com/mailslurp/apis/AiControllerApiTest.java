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
import com.mailslurp.models.GenerateStructuredContentAttachmentOptions;
import com.mailslurp.models.GenerateStructuredContentEmailOptions;
import com.mailslurp.models.StructuredContentResult;
import com.mailslurp.models.StructuredOutputSchema;
import com.mailslurp.models.StructuredOutputSchemaValidation;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AiControllerApi
 */
@Disabled
public class AiControllerApiTest {

    private final AiControllerApi api = new AiControllerApi();

    /**
     * Generate structured content for an attachment
     *
     * Use output schemas to extract data from an attachment using AI
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateStructuredContentFromAttachmentTest() throws ApiException {
        GenerateStructuredContentAttachmentOptions generateStructuredContentAttachmentOptions = null;
        StructuredContentResult response = api.generateStructuredContentFromAttachment(generateStructuredContentAttachmentOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate structured content for an email
     *
     * Use output schemas to extract data from an email using AI
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateStructuredContentFromEmailTest() throws ApiException {
        GenerateStructuredContentEmailOptions generateStructuredContentEmailOptions = null;
        StructuredContentResult response = api.generateStructuredContentFromEmail(generateStructuredContentEmailOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Validate structured content schema
     *
     * Check if a schema is valid and can be used to extract data using AI
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateStructuredOutputSchemaTest() throws ApiException {
        StructuredOutputSchema structuredOutputSchema = null;
        StructuredOutputSchemaValidation response = api.validateStructuredOutputSchema(structuredOutputSchema)
                .execute();
        // TODO: test validations
    }

}
