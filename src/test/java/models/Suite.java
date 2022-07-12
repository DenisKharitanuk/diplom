package models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Data
@Builder
@Getter
@EqualsAndHashCode
public class Suite {
    private int id;
    private String name;
}
