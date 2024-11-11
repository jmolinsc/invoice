package com.app.invoice.datatable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 
 */

@Setter
@Getter
@NoArgsConstructor
public class Column {

    private String data;

    private String name;

    private Boolean searchable;

    private Boolean orderable;

    private Search search;
}
