
# Mark Message as Read Request

## Structure

`MarkMessageAsReadRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MessagingProduct` | `String` | Required | Messaging service used for the request. Use 'whatsapp'. | String getMessagingProduct() | setMessagingProduct(String messagingProduct) |
| `Status` | `String` | Required | A message's status. You can use this field to mark a message as read. | String getStatus() | setStatus(String status) |
| `MessageId` | `String` | Required | Id of the incoming message. | String getMessageId() | setMessageId(String messageId) |

## Example (as JSON)

```json
{
  "messaging_product": "whatsapp",
  "status": "read",
  "message_id": "incoming-message-id"
}
```

