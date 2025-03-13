package dev.tau.flash;

import java.util.List;

public record ModelListResponse(String object, List<GeminiModel> data) {
}
