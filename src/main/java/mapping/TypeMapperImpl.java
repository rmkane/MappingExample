package mapping;

import model.Type;
import model.TypeDto;

public class TypeMapperImpl implements TypeMapper {
	@Override
	public TypeDto typeToTypeDto(Type type) {
		if (type == null) {
			return null;
		}

		return new TypeDto(type.getDescription());
	}
}