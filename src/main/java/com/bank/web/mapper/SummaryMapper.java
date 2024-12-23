package com.bank.web.mapper;

import com.bank.model.Summary;
import com.bank.web.dto.SummaryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SummaryMapper extends Mappable<Summary, SummaryDto>  {
}
