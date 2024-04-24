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
public class Rating {
    private String userId;
    private int rating;
    private String comment;

    // Getters and setters
}
