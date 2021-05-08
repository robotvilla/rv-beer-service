package com.robotvilla.rvbeerservice.web.mappers;

import com.robotvilla.rvbeerservice.domain.Beer;
import com.robotvilla.rvbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
