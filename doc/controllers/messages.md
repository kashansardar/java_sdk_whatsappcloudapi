# Messages

<!-- 
You can use this API to send text messages, media, and message templates to your customers. To send a message, create a **Message** object. Each message is identified by a unique ID. You can also mark an incoming message as read through the `/messages` endpoint. You can track message status with Webhooks by ID. 
-->
Use the **`/{{Phone-Number-ID}}/messages`** endpoint to send text messages, media (audio, documents, images, and video), and message templates to your customers. For more information relating to the messages you can send, see [Messages](#1f4f7644-cc97-40b5-b8e4-c19da268fff1).

Messages are identified by a unique ID. You can track message status in the Webhooks through its ID. You could also mark an incoming message as read through the **`/{{Phone-Number-ID}}/messages`** endpoint.

## Prerequisites

* [User Access Token](https://developers.facebook.com/docs/facebook-login/access-tokens#usertokens) with **`whatsapp_business_messaging`** permission
* `phone-number-id` for your registered WhatsApp account. See [Get Phone Number](#c72d9c17-554d-4ae1-8f9e-b28a94010b28).

```java
MessagesController messagesController = client.getMessagesController();
```

## Class Name

`MessagesController`

## Methods

* [Send Message](../../doc/controllers/messages.md#send-message)
* [Mark Message as Read](../../doc/controllers/messages.md#mark-message-as-read)


# Send Message

Use this endpoint to send text messages, media, message templates to your customers.

```java
CompletableFuture<SendMessageResponse> sendMessageAsync(
    final String phoneNumberID,
    final Message body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `phoneNumberID` | `String` | Template, Required | - |
| `body` | [`Message`](../../doc/models/message.md) | Body, Required | To send a message, you must first assemble a message object with the content you want to send. |

## Response Type

[`SendMessageResponse`](../../doc/models/send-message-response.md)

## Example Usage

```java
String phoneNumberID = "Phone-Number-ID6";
Message body = new Message();
body.setMessagingProduct("whatsapp");
body.setTo("{{Recipient-Phone-Number}}");
body.setTemplate(new Template());
body.getTemplate().setName("hello_world");
body.getTemplate().setLanguage(new Language());
body.getTemplate().getLanguage().setCode("en_US");
body.setType(MessageTypeEnum.TEMPLATE);

messagesController.sendMessageAsync(phoneNumberID, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "messaging_product": "whatsapp",
  "contacts": [
    {
      "input": "48XXXXXXXXX",
      "wa_id": "48XXXXXXXXX "
    }
  ],
  "messages": [
    {
      "id": "wamid.gBGGSFcCNEOPAgkO_KJ55r4w_ww"
    }
  ]
}
```


# Mark Message as Read

When you receive an incoming message from Webhooks, you could use messages endpoint to change the status of it to read.  
We recommend marking incoming messages as read within 30 days of receipt.  
**Note**: You cannot mark outgoing messages you sent as read.

You need to obtain the **`message_id`** of the incoming message from Webhooks.

```java
CompletableFuture<SuccessResponse> markMessageAsReadAsync(
    final String phoneNumberID,
    final MarkMessageAsReadRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `phoneNumberID` | `String` | Template, Required | - |
| `body` | [`MarkMessageAsReadRequest`](../../doc/models/mark-message-as-read-request.md) | Body, Required | - |

## Response Type

[`SuccessResponse`](../../doc/models/success-response.md)

## Example Usage

```java
String phoneNumberID = "Phone-Number-ID6";
MarkMessageAsReadRequest body = new MarkMessageAsReadRequest();
body.setMessagingProduct("whatsapp");
body.setStatus("read");
body.setMessageId("incoming-message-id");

messagesController.markMessageAsReadAsync(phoneNumberID, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "success": true
}
```

