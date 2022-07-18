/*
 * WhatsAppCloudAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.facebook.graph.controllers;

import com.facebook.graph.ApiHelper;
import com.facebook.graph.AuthManager;
import com.facebook.graph.Configuration;
import com.facebook.graph.exceptions.ApiException;
import com.facebook.graph.http.Headers;
import com.facebook.graph.http.client.HttpClient;
import com.facebook.graph.http.client.HttpContext;
import com.facebook.graph.http.request.HttpRequest;
import com.facebook.graph.http.response.HttpResponse;
import com.facebook.graph.http.response.HttpStringResponse;
import com.facebook.graph.models.ContentTypeEnum;
import com.facebook.graph.models.RegisterPhoneRequest;
import com.facebook.graph.models.SuccessResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class RegistrationController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public RegistrationController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * Used to register a phone number or to migrate WhatsApp Business Accounts from a current
     * On-Premises deployment to the new Cloud-Based API. Business Solution Providers (BSPs) must
     * authenticate themselves with an access token with the whatsapp_business_management
     * permission.
     * @param  phoneNumberID  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the SuccessResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SuccessResponse registerPhone(
            final String phoneNumberID,
            final RegisterPhoneRequest body) throws ApiException, IOException {
        HttpRequest request = buildRegisterPhoneRequest(phoneNumberID, body);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRegisterPhoneResponse(context);
    }

    /**
     * Used to register a phone number or to migrate WhatsApp Business Accounts from a current
     * On-Premises deployment to the new Cloud-Based API. Business Solution Providers (BSPs) must
     * authenticate themselves with an access token with the whatsapp_business_management
     * permission.
     * @param  phoneNumberID  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the SuccessResponse response from the API call
     */
    public CompletableFuture<SuccessResponse> registerPhoneAsync(
            final String phoneNumberID,
            final RegisterPhoneRequest body) {
        return makeHttpCallAsync(() -> buildRegisterPhoneRequest(phoneNumberID, body),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleRegisterPhoneResponse(context));
    }

    /**
     * Builds the HttpRequest object for registerPhone.
     */
    private HttpRequest buildRegisterPhoneRequest(
            final String phoneNumberID,
            final RegisterPhoneRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/{Phone-Number-ID}/register");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("Phone-Number-ID",
                new SimpleEntry<Object, Boolean>(phoneNumberID, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        return request;
    }

    /**
     * Processes the response for registerPhone.
     * @return An object of type SuccessResponse
     */
    private SuccessResponse handleRegisterPhoneResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        SuccessResponse result = ApiHelper.deserialize(responseBody,
                SuccessResponse.class);

        return result;
    }

    /**
     * Used to deregister a phone number. Deregister phone removes a previously registered phone.
     * You can always re-register your phone using by repeating the registration process. Business
     * Solution Providers (BSPs) must authenticate themselves with an access token with the
     * whatsapp_business_management permission.
     * @param  contentType  Required parameter: Example:
     * @param  phoneNumberID  Required parameter: Example:
     * @return    Returns the SuccessResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SuccessResponse deregisterPhone(
            final ContentTypeEnum contentType,
            final String phoneNumberID) throws ApiException, IOException {
        HttpRequest request = buildDeregisterPhoneRequest(contentType, phoneNumberID);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDeregisterPhoneResponse(context);
    }

    /**
     * Used to deregister a phone number. Deregister phone removes a previously registered phone.
     * You can always re-register your phone using by repeating the registration process. Business
     * Solution Providers (BSPs) must authenticate themselves with an access token with the
     * whatsapp_business_management permission.
     * @param  contentType  Required parameter: Example:
     * @param  phoneNumberID  Required parameter: Example:
     * @return    Returns the SuccessResponse response from the API call
     */
    public CompletableFuture<SuccessResponse> deregisterPhoneAsync(
            final ContentTypeEnum contentType,
            final String phoneNumberID) {
        return makeHttpCallAsync(() -> buildDeregisterPhoneRequest(contentType, phoneNumberID),
            req -> authManagers.get("global").applyAsync(req)
                .thenCompose(request -> getClientInstance()
                        .executeAsync(request, false)),
            context -> handleDeregisterPhoneResponse(context));
    }

    /**
     * Builds the HttpRequest object for deregisterPhone.
     */
    private HttpRequest buildDeregisterPhoneRequest(
            final ContentTypeEnum contentType,
            final String phoneNumberID) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/{Phone-Number-ID}/deregister");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("Phone-Number-ID",
                new SimpleEntry<Object, Boolean>(phoneNumberID, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type",
                (contentType != null) ? contentType.value() : null);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().post(queryBuilder, headers, null, null);

        return request;
    }

    /**
     * Processes the response for deregisterPhone.
     * @return An object of type SuccessResponse
     */
    private SuccessResponse handleDeregisterPhoneResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        SuccessResponse result = ApiHelper.deserialize(responseBody,
                SuccessResponse.class);

        return result;
    }

}