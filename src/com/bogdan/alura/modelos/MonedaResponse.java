package com.bogdan.alura.modelos;

import java.util.HashMap;

public record MonedaResponse(String base_code, HashMap<String, Double> conversion_rates) {
}
