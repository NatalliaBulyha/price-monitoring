package by.senla.training.bulyha.pricemonitoring.good;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoodUpdateDto {

    private Long id;
    private String name;
    private String producer;
    private String country;
    private String description;
    private Long subcategoryId;
}
