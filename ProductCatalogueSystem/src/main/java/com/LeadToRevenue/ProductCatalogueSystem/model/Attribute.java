package com.LeadToRevenue.ProductCatalogueSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Attribute {
    private String key;
    private String value;

    // getters and setters
}
