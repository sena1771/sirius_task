package services;

import java.util.Arrays;
import java.util.List;

import s.productType;

public class service {
	
	 public static List<productType> getAllTypes() {
			return Arrays.asList(productType.values());
		}
	 
}
