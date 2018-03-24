package com.edu.control.dto.mapper;

import com.edu.control.dto.ItemHistoryDTO;
import com.edu.entity.ItemHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by catal on 1/14/2018
 */
@Mapper
public interface ItemHistoryDTOMapper {

    ItemHistoryDTOMapper INSTANCE = Mappers.getMapper(ItemHistoryDTOMapper.class);

    ItemHistoryDTO mapToDto(ItemHistory itemHistory);

    ItemHistory mapToEntity(ItemHistoryDTO itemHistoryDTO);

}

