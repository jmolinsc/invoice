package com.app.invoice.datatable;

import lombok.*;

/**
 * @author Ahmed Nafisul Bari
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order {

    private Integer column;

    private Direction dir;
}
