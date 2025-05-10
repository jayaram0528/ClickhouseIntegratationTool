package com.zeotap.integration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents metadata for a column in either ClickHouse table or Flat File
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ColumnMetadata {
    private String name;
    private String type;
    private boolean selected; 
    
    public ColumnMetadata(String name, String type) {
        this.name = name;
        this.type = type;
        this.selected = false; 
    }
}