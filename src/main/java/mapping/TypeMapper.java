package mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import model.Type;
import model.TypeDto;

@Mapper
public interface TypeMapper {
	TypeMapper INSTANCE = Mappers.getMapper(TypeMapper.class);

	@Mapping(source = "description", target = "description")
	TypeDto typeToTypeDto(Type type);
}