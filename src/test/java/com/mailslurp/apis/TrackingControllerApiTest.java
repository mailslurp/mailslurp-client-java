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
import com.mailslurp.models.CreateTrackingPixelOptions;
import java.time.OffsetDateTime;
import com.mailslurp.models.PageTrackingPixelProjection;
import com.mailslurp.models.TrackingPixelDto;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrackingControllerApi
 */
@Disabled
public class TrackingControllerApiTest {

    private final TrackingControllerApi api = new TrackingControllerApi();

    /**
     * Create tracking pixel
     *
     * Create a tracking pixel. A tracking pixel is an image that can be embedded in an email. When the email is viewed and the image is seen MailSlurp will mark the pixel as seen. Use tracking pixels to monitor email open events. You can receive open notifications via webhook or by fetching the pixel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTrackingPixelTest() throws ApiException {
        CreateTrackingPixelOptions createTrackingPixelOptions = null;
        TrackingPixelDto response = api.createTrackingPixel(createTrackingPixelOptions)
                .execute();
        // TODO: test validations
    }

    /**
     * Get tracking pixels
     *
     * List tracking pixels in paginated form
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTrackingPixelsTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String sort = null;
        String searchFilter = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        PageTrackingPixelProjection response = api.getAllTrackingPixels()
                .page(page)
                .size(size)
                .sort(sort)
                .searchFilter(searchFilter)
                .since(since)
                .before(before)
                .execute();
        // TODO: test validations
    }

    /**
     * Get pixel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTrackingPixelTest() throws ApiException {
        UUID id = null;
        TrackingPixelDto response = api.getTrackingPixel(id)
                .execute();
        // TODO: test validations
    }

}
