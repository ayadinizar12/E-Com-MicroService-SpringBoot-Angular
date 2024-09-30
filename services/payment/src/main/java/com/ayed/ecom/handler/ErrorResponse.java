package com.ayed.ecom.handler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
