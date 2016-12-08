package mapping;

import org.junit.Test;

import mapping.TypeMapper;
import model.Type;
import model.TypeDto;

import static org.junit.Assert.*;

import org.junit.BeforeClass;

public class TypeMapperTest {
	private static TypeDto T1;
	private static TypeDto T2;

	@BeforeClass
	public static void setup() {
		T1 = new TypeDto(Type.T1.getDescription());
		T2 = new TypeDto(Type.T2.getDescription());
	}

	@Test
	public void testMapping() {
		testMapping(Type.T1, T1);
		testMapping(Type.T2, T2);
	}

	private void testMapping(Type input, TypeDto expected) {
		TypeDto actual = TypeMapper.INSTANCE.typeToTypeDto(input);

		assertEquals(expected, actual);
	}
}
