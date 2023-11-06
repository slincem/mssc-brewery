package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import org.mapstruct.Mapper;

@Mapper(uses =  {DateMapper.class})
public interface BeerMapper {

    BeerDtoV2 beerToBeerDtoV2(Beer beer);

    Beer BeerDtoV2ToBeer(BeerDtoV2 dto);
}
